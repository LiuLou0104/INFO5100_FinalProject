/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TestingSite;

import Business.DB4OUtil.DB4OUtil;
import Business.Platform;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class SampleCollectionPeopleWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel mainJFrameContainer;
    private UserAccount loginAccount;
    private Platform platform;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public SampleCollectionPeopleWorkAreaJPanel(JPanel mainJFrameContainer, UserAccount loginAccount, Platform platform) {
        initComponents();
        this.mainJFrameContainer = mainJFrameContainer;
        this.loginAccount = loginAccount;
        this.platform = platform;
        initLeftUserBar();
    }
    
    private void initLeftUserBar() {
        lblUserName.setText(loginAccount.getUsername());
        lblVersion.setText(platform.getVersion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftBar = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnToCollectList = new javax.swing.JButton();
        btnCollectionHistory = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        btnMessages = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblVersion = new javax.swing.JLabel();
        rightContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/DefaultUserIcon.png"))); // NOI18N
        userIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblUserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName.setText("UserName");

        btnToCollectList.setBackground(new java.awt.Color(255, 209, 111));
        btnToCollectList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnToCollectList.setText("To-Collect List");
        btnToCollectList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnToCollectList.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnToCollectList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToCollectListActionPerformed(evt);
            }
        });

        btnCollectionHistory.setBackground(new java.awt.Color(255, 209, 111));
        btnCollectionHistory.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCollectionHistory.setText("Collection History");
        btnCollectionHistory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCollectionHistory.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnSettings.setBackground(new java.awt.Color(255, 209, 111));
        btnSettings.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSettings.setText("Settings");
        btnSettings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSettings.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnMessages.setBackground(new java.awt.Color(255, 209, 111));
        btnMessages.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMessages.setText("Messages");
        btnMessages.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMessages.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnLogout.setBackground(new java.awt.Color(215, 58, 73));
        btnLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log Out");
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblVersion.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lblVersion.setText("v. 1.x.x");

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGroup(leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVersion))
                    .addGroup(leftBarLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnToCollectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCollectionHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMessages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(userIcon)
                .addGap(18, 18, 18)
                .addComponent(lblUserName)
                .addGap(37, 37, 37)
                .addComponent(btnToCollectList)
                .addGap(33, 33, 33)
                .addComponent(btnCollectionHistory)
                .addGap(35, 35, 35)
                .addComponent(btnMessages)
                .addGap(36, 36, 36)
                .addComponent(btnSettings)
                .addGap(36, 36, 36)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVersion)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(leftBar);

        rightContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnToCollectListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToCollectListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnToCollectListActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        mainJFrameContainer.remove(this);
        CardLayout layout = (CardLayout) mainJFrameContainer.getLayout();
        layout.previous(mainJFrameContainer);
        dB4OUtil.storeSystem(platform);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectionHistory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMessages;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnToCollectList;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel leftBar;
    private javax.swing.JPanel rightContainer;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
