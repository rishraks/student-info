/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lp = new javax.swing.JLabel();
        pgb = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(64, 70));
        jPanel2.setLayout(null);

        lp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lp.setForeground(new java.awt.Color(255, 255, 255));
        lp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lp.setText("0%");
        jPanel2.add(lp);
        lp.setBounds(190, 180, 70, 30);

        pgb.setBackground(new java.awt.Color(255, 255, 255));
        pgb.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(pgb);
        pgb.setBounds(80, 230, 300, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Loading....");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(270, 170, 90, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_info/welcome.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 30, 140, 110);

        jLabel3.setFont(new java.awt.Font("Terminator Two", 0, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME TO");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(230, 30, 160, 50);

        jLabel4.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STUDENT INFORMATION");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(200, 70, 250, 50);

        jLabel5.setFont(new java.awt.Font("Terminator Two", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SYSTEM");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(260, 110, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(463, 284));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lp;
    public javax.swing.JProgressBar pgb;
    // End of variables declaration//GEN-END:variables
}
