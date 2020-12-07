/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.NucleicAcidTesterRole.NucleicAcidTesterWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class NucleicAcidTesterRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new NucleicAcidTesterWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
