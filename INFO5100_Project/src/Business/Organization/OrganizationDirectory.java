package Business.Organization;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization getTestingPeopleOrg() {
        for (Organization o : organizationList) {
            if (o.getName().equals(Type.TestingPeople.getValue())) {
                return o;
            }
        }
        return null;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.TestingPeople.getValue())){
            organization = new TestingPeopleOrganization(Type.TestingPeople.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ManageTestingPeople.getValue())){
            organization = new ManageTestingPeopleOrganization(Type.ManageTestingPeople.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SampleCollection.getValue())){
            organization = new SampleCollectionOrganization(Type.SampleCollection.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NucleicAcidTest.getValue())){
            organization = new NucleicAcidTestOrganization(Type.NucleicAcidTest.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TestingSiteDataHandling.getValue())){
            organization = new TestingSiteDataHandlingOrganization(Type.TestingSiteDataHandling.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ManageTestingSite.getValue())){
            organization = new ManageTestingSiteOrganization(Type.ManageTestingSite.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CDCDataHandling.getValue())){
            organization = new CDCDataHandlingOrganization(Type.CDCDataHandling.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CDCInfoDistribution.getValue())){
            organization = new CDCInfoDistributionOrganization(Type.CDCInfoDistribution.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CDCHumanResource.getValue())){
            organization = new CDCHumanResourceOrganization(Type.CDCHumanResource.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Simulation.getValue())){
            organization = new SimulationOrganization(Type.Simulation.getValue());
            organizationList.add(organization);
        }
        
        return organization;
    }
}