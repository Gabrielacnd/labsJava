package isp.lab7.safehome;

import java.util.Map;

public class DoorLockController implements ControllerInterface {


    private  Map<Tenant,AccesKey> validAcces;

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccesKey acces = null;
        for (Map.Entry<Tenant, AccesKey> entry : validAcces.entrySet()) {
            Tenant t = entry.getKey();
            acces = entry.getValue();
        }
        if (pin.equals(acces.getPin())) {

        } else {
            throw new InvalidPinException("Pin is wrong" + pin);
        }

    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        Tenant tenant=new Tenant(name);
         AccesKey accesKey=new AccesKey(pin);
         if(validAcces.containsKey(pin)) {
             throw new TenantAlreadyExistException("Tenant alreay exist"+name);
         }
         validAcces.put(tenant,accesKey);
    }

    @Override
    public void removeTenant(String name) throws Exception {

    }
}
}
