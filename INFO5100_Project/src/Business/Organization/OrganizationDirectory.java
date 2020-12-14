package Business.Organization;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.OrgType;
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
            if (o.getName().equals(OrgType.TestingPeople.getValue())) {
                return o;
            }
        }
        return null;
    }
    
    public Organization createOrganization(OrgType type){
        Organization organization = null;
        if (type.getValue().equals(OrgType.TestingPeople.getValue())){
            organization = new TestingPeopleOrganization(OrgType.TestingPeople.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.ManageTestingPeople.getValue())){
            organization = new ManageTestingPeopleOrganization(OrgType.ManageTestingPeople.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.SampleCollection.getValue())){
            organization = new SampleCollectionOrganization(OrgType.SampleCollection.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.NucleicAcidTest.getValue())){
            organization = new NucleicAcidTestOrganization(OrgType.NucleicAcidTest.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.TestingSiteDataHandling.getValue())){
            organization = new TestingSiteDataHandlingOrganization(OrgType.TestingSiteDataHandling.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.ManageTestingSite.getValue())){
            organization = new ManageTestingSiteOrganization(OrgType.ManageTestingSite.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.CDCDataHandling.getValue())){
            organization = new CDCDataHandlingOrganization(OrgType.CDCDataHandling.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.CDCInfoDistribution.getValue())){
            organization = new CDCInfoDistributionOrganization(OrgType.CDCInfoDistribution.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.CDCHumanResource.getValue())){
            organization = new CDCHumanResourceOrganization(OrgType.CDCHumanResource.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.Simulation.getValue())){
            organization = new SimulationOrganization(OrgType.Simulation.getValue());
            organizationList.add(organization);
        }
        
        return organization;
    }
}