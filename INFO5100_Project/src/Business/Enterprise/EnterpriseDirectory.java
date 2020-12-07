package Business.Enterprise;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.Enterprise.Enterprise.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createEnterprise(Type type){
        Enterprise enterprise = null;
        if (type.getValue().equals(Type.TestingPeople.getValue())){
            enterprise = new TestingPeopleEnterprise(Type.TestingPeople.getValue());
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(Type.TestingSite.getValue())){
            enterprise = new TestingSiteEnterprise(Type.TestingSite.getValue());
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(Type.CDC.getValue())){
            enterprise = new CDCEnterprise(Type.CDC.getValue());
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(Type.PandemicSimulation.getValue())){
            enterprise = new PandemicSimulationEnterprise(Type.PandemicSimulation.getValue());
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}