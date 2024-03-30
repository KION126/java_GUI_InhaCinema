package main;

import java.awt.*;
import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyEvent;

public class LoginFrame extends javax.swing.JFrame {
    JCaptcha jct = new JCaptcha();  //캡챠 객체 생성
    
    public LoginFrame() {
        initComponents();
        initCaptcha();
        setLocationRelativeTo(null); // 프레임 창을 화면 중앙에 배치
    }
    
    // 캡챠 이미지 생성
    private void initCaptcha(){
        lblCaptcha.setIcon(new ImageIcon(jct.JCaptcha()));  // 캡챠 객체의 캡챠 이미지를 라벨에 삽입
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBackground = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/login_register.png")).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        txtID = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblRegister = new javax.swing.JLabel();
        txtPW = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        lblCaptcha = new javax.swing.JLabel();
        btnCaptchaRefresh = new javax.swing.JButton();
        txtCaptchaAnswer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InhaCinema");
        setLocation(new java.awt.Point(125, 30));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnBackground.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setBackground(new java.awt.Color(67, 67, 67));
        txtID.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(153, 153, 153));
        txtID.setText("아이디");
        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        pnBackground.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 300, 45));

        btnLogin.setBackground(new java.awt.Color(40, 71, 192));
        btnLogin.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("로그인");
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnBackground.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 300, 45));

        lblRegister.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("회원가입");
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        pnBackground.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 56, -1));

        txtPW.setBackground(new java.awt.Color(67, 67, 67));
        txtPW.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtPW.setForeground(new java.awt.Color(153, 153, 153));
        txtPW.setText("비밀번호");
        txtPW.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPW.setEchoChar((char) 0);
        txtPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPWFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPWFocusLost(evt);
            }
        });
        txtPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPWMouseClicked(evt);
            }
        });
        txtPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPWKeyTyped(evt);
            }
        });
        pnBackground.add(txtPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 300, 45));

        lblLogin.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("로그인");
        pnBackground.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));
        pnBackground.add(lblCaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 250, 45));

        btnCaptchaRefresh.setText("🔄");
        btnCaptchaRefresh.setBorder(null);
        btnCaptchaRefresh.setFocusable(false);
        btnCaptchaRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaptchaRefreshActionPerformed(evt);
            }
        });
        pnBackground.add(btnCaptchaRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 347, 40, 25));

        txtCaptchaAnswer.setBackground(new java.awt.Color(67, 67, 67));
        txtCaptchaAnswer.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtCaptchaAnswer.setForeground(new java.awt.Color(153, 153, 153));
        txtCaptchaAnswer.setText("자동완성 방지문자");
        txtCaptchaAnswer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCaptchaAnswer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCaptchaAnswerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCaptchaAnswerFocusLost(evt);
            }
        });
        txtCaptchaAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCaptchaAnswerMouseClicked(evt);
            }
        });
        txtCaptchaAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCaptchaAnswerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaptchaAnswerKeyTyped(evt);
            }
        });
        pnBackground.add(txtCaptchaAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 300, 45));

        getContentPane().add(pnBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        // 회원가입 라벨 클릭 시
        RegisterFrame frame = new RegisterFrame();  // 회원가입 프레임으로 전환
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // txtID 텍스트 필드 클릭 시
        txtID.setFocusable(true);   // 텍스트필드 포커싱
        txtID.requestFocus();
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // txtID 텍스트 필드에 키가 입력될 시
        if(txtID.getText().length() > 16) evt.consume();    // 텍스트필드 안에 글자 수가 16자 이상이면 입력 무시
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtPWKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPWKeyTyped
        // txtPW 텍스트 필드에 키가 입력될 시
        if(txtPW.getText().length() > 16) evt.consume();     // 텍스트필드 안에 글자 수가 16자 이상이면 입력 무시
    }//GEN-LAST:event_txtPWKeyTyped

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // 로그인 버튼 클릭 시
        String id = txtID.getText();                // 각 텍스트필드의 입력된 값을 가져옴
        String pw = txtPW.getText();
        String ct = txtCaptchaAnswer.getText();
        
        // 유효성 검사
        if(id.equals("아이디") || id.length() == 0){    // 아이디 텍스트 필드에 입력 값이 없을 때
            JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
        } else if(pw.equals("비밀번호") || pw.length() == 0){   // 비밀번호 텍스트 필드에 입력 값이 없을 때
            JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
        } else if(ct.equals("자동완성 방지문자") || ct.length() == 0){  // 자동완성 방지문자 텍스트 필드에 입력 값이 없을 때
            JOptionPane.showMessageDialog(null, "자동완성 방지문자를 입력해주세요.");
        } else if(!jct.captchaAnswer(ct)){  // 캡챠 텍스트 필드에 입력 값이 정답이 아닐 때
            JOptionPane.showMessageDialog(null, "자동완성 방지문자가 틀렸습니다.\n다시 입력해주세요.");
            initCaptcha();      // 캡챠 이미지 새로고침
            txtCaptchaAnswer.setText(null);     // 캡챠 텍스트 필드 초기화
        }else{
            DB db = new DB();   // DB연동
            String sql = "SELECT count(*) as isIdValid FROM users WHERE id = ?"; // 존재하는 ID인지 확인하는 SQL    
            try {
                db.open();
                db.stmt = db.connect.prepareStatement(sql);
                db.stmt.setString(1, id);   // sql문장 파라미터 1의 값을 입력한 ID값으로 지정
                db.rs = db.stmt.executeQuery();
                
                int isIdValid = 0;
                while(db.rs.next()) {isIdValid = db.rs.getInt("isIdValid");}    // 입력한 ID의 존재 여부를 추출
                
                if(isIdValid == 1) { // 아이디가 존재하는 경우
                    sql = "SELECT * FROM users WHERE id = ? and pw = md5(?)"; // ID와 PW가 일치하는지 확인하는 SQL
                    db.stmt = db.connect.prepareStatement(sql);
                    db.stmt.setString(1, id);   // sql문장 파라미터 1의 값을 입력한 ID값으로 지정
                    db.stmt.setString(2, pw);   // sql문장 파라미터 2의 값을 입력한 password값으로 지정
                    db.rs = db.stmt.executeQuery();
                    
                    int isAllValid = 0;
                    User user = new User();
                    
                    while(db.rs.next()) {
                        isAllValid = 1;
                        user.setId(db.rs.getString("id"));  // user클래스에 id를 지정
                        user.setNickname(db.rs.getString("nickname"));  // user클래스에 nickname를 지정
                    }
                   
                    if(isAllValid == 1) { // 비밀번호가 일치                        
                        MainFrame frame = new MainFrame(user);
			frame.setVisible(true);
                        dispose();
                        return;
                    }else { // 비밀번호 불일치
                        JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
                    }   
                } else { // 아이디가 존재하지 않을 경우
                    JOptionPane.showMessageDialog(null, "존재하지 않는 아이디 입니다."); 
                }
                // 컴포넌트 초기화
                initCaptcha();
                txtID.setText("아이디");
                txtPW.setText("비밀번호");
                txtCaptchaAnswer.setText("자동완성 방지문자");
            } catch (SQLException e) {
                System.out.println("Login SQLExceiption : " + e.getMessage());
            } finally {
                
                db.close();
            }        
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPWMouseClicked
        // txtPW 텍스트 필드가 클릭 시
        txtPW.setFocusable(true);   // 포커싱
        txtPW.requestFocus();
    }//GEN-LAST:event_txtPWMouseClicked

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // txtID 텍스트 필드가 포커스가 풀릴 시
        if(txtID.getText().length() == 0) txtID.setText("아이디");  // 초기화
    }//GEN-LAST:event_txtIDFocusLost

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        // txtID 텍스트 필드가 포커스 될 시
        if(txtID.getText().equals("아이디")) txtID.setText(null);   // 초기화
    }//GEN-LAST:event_txtIDFocusGained

    private void txtPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWFocusGained
        // txtPW 텍스트 필가 포커스 될 시
        if(txtPW.getText().equals("비밀번호")){
            txtPW.setText(null);
            txtPW.setEchoChar('●');
        }
    }//GEN-LAST:event_txtPWFocusGained

    private void txtPWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWFocusLost
        // txtPW 텍스트 필드가 포커스가 풀릴 시
        if(txtPW.getText().length() == 0){
            txtPW.setText("비밀번호");
            txtPW.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_txtPWFocusLost

    private void btnCaptchaRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaptchaRefreshActionPerformed
        // 캡챠 이미지 새로고침 버튼
        initCaptcha();
    }//GEN-LAST:event_btnCaptchaRefreshActionPerformed

    private void txtCaptchaAnswerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCaptchaAnswerFocusLost
       // txtCaptchaAnswer 텍스트 필드가 포커스가 풀릴 시
        if(txtCaptchaAnswer.getText().length() == 0) txtCaptchaAnswer.setText("자동완성 방지문자");
    }//GEN-LAST:event_txtCaptchaAnswerFocusLost

    private void txtCaptchaAnswerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCaptchaAnswerFocusGained
        // txtCaptchaAnswer 텍스트 필드가 포커스 될 시
        if(txtCaptchaAnswer.getText().equals("자동완성 방지문자")) txtCaptchaAnswer.setText(null);
    }//GEN-LAST:event_txtCaptchaAnswerFocusGained

    private void txtCaptchaAnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCaptchaAnswerMouseClicked
        // txtCaptchaAnswer 텍스트 필드 클릭 시
        txtCaptchaAnswer.setFocusable(true);
        txtCaptchaAnswer.requestFocus();
    }//GEN-LAST:event_txtCaptchaAnswerMouseClicked

    private void txtCaptchaAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaptchaAnswerKeyTyped
        // txtCaptchaAnswer 텍스트 필드에 키가 입력될 시
        if(txtCaptchaAnswer.getText().length() > 4) evt.consume();
    }//GEN-LAST:event_txtCaptchaAnswerKeyTyped

    private void txtCaptchaAnswerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaptchaAnswerKeyPressed
        // txtCaptchaAnswer 텍스트 필드에서 엔터키를 누르면 로그인버튼 클릭
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtCaptchaAnswerKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    Thread.sleep(3500);
                } catch(InterruptedException e){
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, e);
                }
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaptchaRefresh;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCaptcha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JTextField txtCaptchaAnswer;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPW;
    // End of variables declaration//GEN-END:variables
}
