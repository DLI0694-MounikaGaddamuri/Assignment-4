import java.util.*;
public class PolicyManagement {

    static  int pNumber=0;

    long policy_number;
    String holder_name,insurance_type;
    int coverage_amount;

    PolicyManagement(long policy_number,String holder_name,String insurance_type,int coverage_amount){
        this.policy_number=policy_number;
        this.holder_name=holder_name;
        this.insurance_type=insurance_type;
        this.coverage_amount=coverage_amount;
    }

    public static void addNewPolicy(ArrayList<PolicyManagement> policyManagementPersonsList,Scanner input){
        System.out.println("Enter holder's name: ");
        String holder_name = input.nextLine();
        System.out.println("Enter the type of insurance (e.g.health, life, auto):");
        String insurance_type = input.nextLine();
        System.out.println("Enter the coverage amount: ");
        int coverage_amount=input.nextInt();

        policyManagementPersonsList.add(new PolicyManagement(++pNumber,holder_name,insurance_type,coverage_amount));
    }

    public static void displayPolicyDetails(ArrayList<PolicyManagement> policyManagementPersonsList,Scanner input){
        System.out.println("Enter the policy type, which you want to display: ");
        String policy_type = input.nextLine();
        for(PolicyManagement p:policyManagementPersonsList){
            if(p.insurance_type.equals(policy_type))
                System.out.println(p.policy_number+" "+p.holder_name+" "+p.insurance_type+" "+p.coverage_amount);
        }
    }

    public static void removePolicy(ArrayList<PolicyManagement> policyManagementPersonsList,Scanner input){
        System.out.println("Enter the policy number you want to remove?");
        int number = input.nextInt();
        Iterator<PolicyManagement> itr = policyManagementPersonsList.iterator();
        while(itr.hasNext()){
            PolicyManagement p = itr.next();
            if(p.policy_number==number) {
                itr.remove();
                break;
            }
        }
    }

    public static void updatePolicyDetails(ArrayList<PolicyManagement> policyManagementPersonsList, Scanner input) {
        System.out.println("Enter the name of the person, whose details you want to edit: ");
        String editPersonDetails=input.nextLine();
        for(PolicyManagement p:policyManagementPersonsList) {
            if(p.holder_name.equals(editPersonDetails)) {
                System.out.println("Enter the field, which you want to edit (1.holder_name,2.insurance_type,3.coverage_amount):");
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the new holder name:");
                        p.holder_name=input.nextLine();
                        System.out.println(p.policy_number+" "+p.holder_name+" "+p.insurance_type+" "+p.coverage_amount);
                        break;

                    case 2:
                        System.out.println("Enter the new insurance type:");
                        p.insurance_type=input.nextLine();
                        System.out.println(p.policy_number+" "+p.holder_name+" "+p.insurance_type+" "+p.coverage_amount);
                        break;

                    case 3:
                        System.out.println("Enter the coverage amount:");
                        p.coverage_amount=input.nextInt();
                        System.out.println(p.policy_number+" "+p.holder_name+" "+p.insurance_type+" "+p.coverage_amount);
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<PolicyManagement> policyManagementPersonsList = new ArrayList<>();
        char ch;
        do{
            System.out.println("1.Add new Policy");
            System.out.println("2.Remove Policy");
            System.out.println("3.Update Policy details");
            System.out.println("4.List all policies of a specific type");

            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    addNewPolicy(policyManagementPersonsList,input);
                    break;

                case 2:
                    removePolicy(policyManagementPersonsList,input);
                    break;

                case 3:
                    updatePolicyDetails(policyManagementPersonsList,input);
                    break;

                case 4:
                    displayPolicyDetails(policyManagementPersonsList,input);
                    break;
            }
            System.out.println("Do you want to continue? If yes then enter y else n");
            ch=input.next().charAt(0);
        }while(ch=='y');
    }
}
