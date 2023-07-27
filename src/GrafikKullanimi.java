
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel{

    
    @Override
    public void paint(Graphics g) {
    
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        g.setColor(Color.pink);
        
        
        g.drawRect(100, 10, 30, 40); // içi boş çizer.
        
        g.fillRect(200, 100, 30, 40); // içi dolu çizer.

        g.setColor(Color.blue);
        
        g.drawOval(200, 200, 60, 60); // içi boş 
        
        g.fillOval(300, 300, 40, 40); // içi dolu
        
        g.setColor(Color.yellow);
        
        g.drawLine(100, 100, 300, 300); // Doğru Parçası (çizgi) çizer. 
        
        
    }
    
     
    public GrafikKullanimi() {
        
        setBackground(Color.black);
    
        
    }

 
    
    
    
}
