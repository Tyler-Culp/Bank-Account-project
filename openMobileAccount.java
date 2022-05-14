public class openMobileAccount extends Account{

    boolean validUser;


    public static boolean validateUser(String userName, String password){
        for (int i = 0; i < Account.getAccountLists().size(); i++){
            if(userName.equals(Account.getAccountLists().get(i).getuserName()) && 
            password.equals(Account.getAccountLists().get(i).getPassword())){
                return true;
            }
        }
        return false;
    }



}
