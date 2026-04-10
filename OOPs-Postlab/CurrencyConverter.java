import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.HashMap;

public class CurrencyConverter extends JFrame {

    private JTextField amountField;
    private JComboBox<String> fromCurrency, toCurrency;
    private JLabel resultLabel;

    private HashMap<String, Double> exchangeRates;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initRates();
        initUI();
    }

    // Initialize static exchange rates
    private void initRates() {
        exchangeRates = new HashMap<>();

        exchangeRates.put("USD", 1.0);
        exchangeRates.put("INR", 83.0);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("GBP", 0.78);
        exchangeRates.put("JPY", 150.0);
    }

    // UI Design
    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(30, 30, 30));

        JLabel title = new JLabel("Currency Converter");
        title.setBounds(100, 10, 300, 30);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        panel.add(title);

        JLabel amountLabel = new JLabel("Enter Amount:");
        amountLabel.setBounds(30, 60, 150, 25);
        amountLabel.setForeground(Color.WHITE);
        panel.add(amountLabel);

        amountField = new JTextField();
        amountField.setBounds(180, 60, 200, 30);
        panel.add(amountField);

        JLabel fromLabel = new JLabel("From:");
        fromLabel.setBounds(30, 110, 100, 25);
        fromLabel.setForeground(Color.WHITE);
        panel.add(fromLabel);

        fromCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        fromCurrency.setBounds(180, 110, 200, 30);
        panel.add(fromCurrency);

        JLabel toLabel = new JLabel("To:");
        toLabel.setBounds(30, 160, 100, 25);
        toLabel.setForeground(Color.WHITE);
        panel.add(toLabel);

        toCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        toCurrency.setBounds(180, 160, 200, 30);
        panel.add(toCurrency);

        JButton convertBtn = new JButton("Convert");
        convertBtn.setBounds(150, 210, 120, 35);
        convertBtn.setBackground(new Color(0, 153, 255));
        convertBtn.setForeground(Color.WHITE);
        convertBtn.setFocusPainted(false);
        panel.add(convertBtn);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 260, 350, 30);
        resultLabel.setForeground(Color.GREEN);
        resultLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        panel.add(resultLabel);

        convertBtn.addActionListener(e -> convertCurrency());

        add(panel);
    }

    // Conversion Logic
    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(amountField.getText());

            String from = (String) fromCurrency.getSelectedItem();
            String to = (String) toCurrency.getSelectedItem();

            double fromRate = exchangeRates.get(from);
            double toRate = exchangeRates.get(to);

            double usdAmount = amount / fromRate;
            double convertedAmount = usdAmount * toRate;

            DecimalFormat df = new DecimalFormat("#.##");

            resultLabel.setText("Result: " + df.format(convertedAmount) + " " + to);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CurrencyConverter().setVisible(true);
        });
    }
}