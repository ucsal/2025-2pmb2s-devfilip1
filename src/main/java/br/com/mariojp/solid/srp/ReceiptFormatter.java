package br.com.mariojp.solid.srp;

public class ReceiptFormatter {

    public String generateReceipt(Order order, double subtotal, double tax) {
        StringBuilder sb = new StringBuilder();

        sb.append("===RECIBO===\n");

        for (Item i : order.getItems()) {
            sb.append(i.getName() + " x" + i.getQuantity() + " = $" + i.getUnitPrice()*i.getQuantity() + "\n");
        }

        sb.append("Subtotal: $" + subtotal + "\n").append("Tax: $" + tax + "\n").append("Total: $" + subtotal*tax);

        return sb.toString();
    }
}
