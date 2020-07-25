package shop;

public class DiscountRate {
	public final static double serviceDiscountPremium=0.2;
	public final static double serviceDiscountGold=0.15;
	public final static double serviceDiscountSliver=0.1;
	public final static double productDiscountPremium=0.1;
	public final static double productDiscountGold=0.05;
	public final static double productDiscountSliver=0.01;
	
	
	public static double getServiceDiscountRate(String memberType) {
		double serviceExpense = 0;
		switch(memberType) {
		case "Premium":
				serviceExpense=serviceDiscountPremium;
				System.out.println("You are premium."+serviceExpense);
				break;
		case "Gold":
				serviceExpense=serviceDiscountGold;
				System.out.println("You are gold."+serviceExpense);
				break;
		case "Sliver":
				serviceExpense=serviceDiscountSliver;
				System.out.println("You are sliver."+serviceExpense);
				break;
		default:
				System.out.println("Your are not a member");
				break;
		}
		return serviceExpense;
	}
	
	public double getProductDiscountRate(String memberType) {
	double productExpense = 0;
	switch(memberType) {
	case "Premium":
			productExpense=productDiscountPremium;
			System.out.println("You are premium."+productExpense);
			break;
	case "Gold":
			productExpense=productDiscountGold;
			System.out.println("You are gold."+productExpense);
			break;
	case "Sliver":
			productExpense=productDiscountSliver;
			System.out.println("You are sliver."+productExpense);
			break;
	default:
			System.out.println("Your are not a member");
			break;
	}
	return productExpense;
	}
}
