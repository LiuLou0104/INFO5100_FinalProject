package Business.Enterprise;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.Enterprise.Enterprise.EnterpriseType;
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
    
    public Enterprise createEnterprise(EnterpriseType type){
        Enterprise enterprise = null;
        if (type.getValue().equals(EnterpriseType.TestingPeople.getValue())){
            enterprise = new TestingPeopleEnterprise(EnterpriseType.TestingPeople.getValue());
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(EnterpriseType.TestingSite.getValue())){
            enterprise = new TestingSiteEnterprise(EnterpriseType.TestingSite.getValue());
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(EnterpriseType.CDC.getValue())){
            enterprise = new CDCEnterprise(EnterpriseType.CDC.getValue());
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(EnterpriseType.PandemicSimulation.getValue())){
            enterprise = new PandemicSimulationEnterprise(EnterpriseType.PandemicSimulation.getValue());
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}