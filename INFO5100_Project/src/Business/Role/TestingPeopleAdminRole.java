/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TestingPeopleAdminRole.TestingPeopleAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class TestingPeopleAdminRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new TestingPeopleAdminWorkAreaJPanel(userProcessContainer, account,business);
    }
    
    
}
