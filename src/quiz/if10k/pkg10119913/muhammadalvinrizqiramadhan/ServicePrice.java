/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119913.muhammadalvinrizqiramadhan;

/**
 *
 * @author Lenovo
 */
public class ServicePrice implements ServiceItem {
    float priceService;
    float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    @Override
    public void displayService() {
        System.out.println("#*************************# ");
        System.out.println("#***Rock n Roll Haircut***# ");
        System.out.println("#*******Service List******# ");
        System.out.println("1. Haircut : IDR 45K  ");
        System.out.println("2. Haircut + Hairwash: IDR 55K  ");
        System.out.println("3. Hairwash Only : IDR 15K ");
        System.out.println("#*************************# ");
        System.out.println("Choose (1/2/3): ");
    }

    @Override
    public float getPrice(int serviceItem) {
        if(serviceItem ==1){
            return 45000;
        }else if(serviceItem == 2){
            return 55000;
        }else if(serviceItem == 3){
            return 15000;
        }
        
        return 0;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
         statusMember.toLowerCase();
        if(statusMember.equals("yes")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
if(isMember)

        {

            return (float) (parServicePrice * 0.1);

        }

        else

        {

            return 0;

        }//To change body of generated methods, choose Tools | Templates.
    }
    
    public float getTotalPay(float priceService,float discount){
         return priceService - discount;
        
    }
    
}
