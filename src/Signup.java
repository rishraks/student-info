import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.sql.*;

/**
 *
 * @author User
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        DP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        e1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        n1 = new javax.swing.JTextField();
        ph1 = new javax.swing.JTextField();
        pw1 = new javax.swing.JPasswordField();
        SP = new javax.swing.JPanel();
        SL = new javax.swing.JLabel();
        CP = new javax.swing.JPanel();
        CL = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(781, 514));
        jPanel4.setLayout(null);
        jPanel4.add(jLabel9);
        jLabel9.setBounds(0, 0, 781, 514);

        DP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DPMouseDragged(evt);
            }
        });
        DP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DPMousePressed(evt);
            }
        });
        DP.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_info/signup.jpg"))); // NOI18N
        DP.add(jLabel3);
        jLabel3.setBounds(0, 0, 399, 514);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        DP.add(jPanel3);
        jPanel3.setBounds(0, 0, 399, 514);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(376, 514));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setText("Register");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText(" NAME");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText(" EMAIL ID");

        e1.setBorder(null);
        e1.setOpaque(false);
        e1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                e1KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText(" PHONE NO");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText(" CONFIRM PASSWORD");

        n1.setBorder(null);
        n1.setOpaque(false);
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n1KeyReleased(evt);
            }
        });

        ph1.setBorder(null);
        ph1.setOpaque(false);

        pw1.setBorder(null);
        pw1.setOpaque(false);

        SP.setBackground(new java.awt.Color(255, 255, 255));
        SP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SL.setBackground(new java.awt.Color(255, 255, 255));
        SL.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        SL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SL.setText("SIGN UP");
        SL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SPLayout = new javax.swing.GroupLayout(SP);
        SP.setLayout(SPLayout);
        SPLayout.setHorizontalGroup(
            SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SL, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        SPLayout.setVerticalGroup(
            SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SL, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        CP.setBackground(new java.awt.Color(255, 255, 255));
        CP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        CP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CP.setPreferredSize(new java.awt.Dimension(133, 44));

        CL.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        CL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CL.setText("CANCEL");
        CL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CPLayout = new javax.swing.GroupLayout(CP);
        CP.setLayout(CPLayout);
        CPLayout.setHorizontalGroup(
            CPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CL, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        CPLayout.setVerticalGroup(
            CPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\icons8-login-100.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ph1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(e1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(ph1))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(781, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SLMouseClicked
        String na=n1.getText();
        String eid=e1.getText();
        long phn=Long.parseLong(ph1.getText());
        String pwd=String.valueOf(pw1.getPassword());
        if (eid.equals("")||na.equals("")||pwd.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Some fields are empty");
        }
        try{
           Class.forName("java.sql.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
           String qa="Select * from login where name=? and email=? and phone_no=? and password=?";
           PreparedStatement ps=con.prepareStatement(qa);
           ps.setString(1,na);
           ps.setString(2,eid );
           ps.setLong(3,phn);
           ps.setString(4,pwd);
           ResultSet rs=ps.executeQuery();
           if(rs.next())
           {
                JOptionPane.showMessageDialog(null,"You already have an account");
                this.dispose();
                Login ln=new Login();
                ln.setVisible(true); 
          con.close();
          rs.close();
          
           }
           PreparedStatement pst=null;
           pst=con.prepareStatement("insert into login values(?,?,?,?)");
           pst.setString(1, na);
           pst.setString(2, eid);
           pst.setLong(3, phn);
           pst.setString(4, pwd);
           int i=pst.executeUpdate();
            if (i>0)
           {
               JOptionPane.showMessageDialog(null,"You have Signed Up successfully ");
               this.dispose();
               Login ln=new Login();
               ln.setVisible(true);
           }
           
          }
       catch(Exception e)
       {
        System.out.println();
       }
    }//GEN-LAST:event_SLMouseClicked

    private void SLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SLMouseEntered
        SL.setForeground(Color.WHITE);
        SP.setBackground(new Color(51,51,255));
        SP.setBorder(new LineBorder(Color.BLACK,1,true));
    }//GEN-LAST:event_SLMouseEntered

    private void SLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SLMouseExited
        SL.setForeground(new Color(0,0,0));
        SP.setBackground(Color.WHITE);
        SP.setBorder(new LineBorder(new Color(51,51,255),1,true));
    }//GEN-LAST:event_SLMouseExited

    private void CLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLMouseClicked
        JOptionPane.showMessageDialog(this,"Do you really want to Cancel","Question",JOptionPane.QUESTION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_CLMouseClicked

    private void CLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLMouseEntered
        CL.setForeground(Color.WHITE);
        CP.setBackground(new Color(51,51,255));
        CP.setBorder(new LineBorder(Color.BLACK,1,true));
    }//GEN-LAST:event_CLMouseEntered

    private void CLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLMouseExited
        CL.setForeground(new Color(0,0,0));
        CP.setBackground(Color.WHITE);
        CP.setBorder(new LineBorder(new Color(51,51,255),1,true));
    }//GEN-LAST:event_CLMouseExited
private int xMouse,yMouse;
    private void DPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DPMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_DPMouseDragged

    private void DPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DPMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_DPMousePressed

    private void n1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyReleased
         String na=n1.getText();
        String nam=na.toUpperCase();
        if(na.equals(nam))
        {
            n1.setText(na);
        }
        else{
            JOptionPane.showMessageDialog(this,"PLEASE ENTER IN BLOCK LETTERS","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_n1KeyReleased

    private void e1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_e1KeyReleased
        String eid=e1.getText();
        String emd=eid.toLowerCase();
        if(eid.equals(emd))
        {
            e1.setText(eid);
        }
        else{
            JOptionPane.showMessageDialog(this,"PLEASE ENTER IN BLOCK LETTERS","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_e1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CL;
    private javax.swing.JPanel CP;
    private javax.swing.JPanel DP;
    private javax.swing.JLabel SL;
    private javax.swing.JPanel SP;
    private javax.swing.JTextField e1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField ph1;
    private javax.swing.JPasswordField pw1;
    // End of variables declaration//GEN-END:variables
}
