package br.com.mariojp.solid.srp;

public class ReceiptService {
	public ReceiptService() {}

	private double subtotalCalculator(Order order){
		double subtotal = 0;
		for (Item i : order.getItems()) {
			subtotal += i.getUnitPrice() * i.getQuantity();
		}

		return subtotal;
	}

	public String generate(Order order){
		double tax = new TaxCalculator().calculator(order);
		double subtotal = subtotalCalculator(order);

		String receipt = new ReceiptFormatter().generateReceipt(order, subtotal, tax);

		return receipt;
	}
}
