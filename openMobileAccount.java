public class openMobileAccount extends Account{


    public openMobileAccount(){
        super();
    }

    public boolean validateUser(String userName, String password){
        if(userName != this.getAccountName() || password != this.getPassword()){
            return false;
        }
        return true;
    }



}
