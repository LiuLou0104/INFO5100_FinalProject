/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RegisteredTestingPeopleRole.RegisteredTestingPeopleWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class RegisteredTestingPeopleRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new RegisteredTestingPeopleWorkAreaJPanel(userProcessContainer, account, business);
    }

    
    
}
