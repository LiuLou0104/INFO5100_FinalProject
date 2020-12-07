/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TestingSiteDataHandlerRole.TestingSiteDataHandlerWorkAreaJPanel;

/**
 *
 * @author Administrator
 */
public class TestingSiteDataHandlerRole {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new TestingSiteDataHandlerWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
