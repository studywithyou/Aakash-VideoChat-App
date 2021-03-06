
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sumantra
 */
public class ChangePassword extends javax.swing.JFrame {
	
        //XML file
	private File xmlFile;
        //to parse the XML file
	private DocumentBuilderFactory docFactory;
	private DocumentBuilder docBuilder;
	private Document doc;
	
	//to point an element of XML file
	private Node Pswd;
	private NodeList nList;
	
	
	/*//to reflect the changes to the XML file
	private Transformer transformer;
	private TransformerFactory transformerFactory;
	private DOMSource source;
	private StreamResult result;
        */
        private String pswd;
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        super("Video Conferencing Server");
        initComponents();
        //this is to set the image of the jpanel to our rquired image....    
               try
               {
               String dir = System.getProperty("user.dir");
               Image img= ImageIO.read(new File(dir+"\\"+"server.jpg"));
               setIconImage(img);
               }
        catch(Exception e)
        {
            System.out.println("Error image: " + e.getMessage());
        }
         /*      xmlFile = new File("AdminPassword.xml");
               //parse xml
               docFactory = DocumentBuilderFactory.newInstance();
		
		try 
    	{
			docBuilder = docFactory.newDocumentBuilder();
			//parse the XML file
			doc = docBuilder.parse(xmlFile);
			//get the parent tag
			Pswd = doc.getElementsByTagName("Pswd").item(0);
		} 
    	catch (ParserConfigurationException e) 
    	{
    		JOptionPane.showMessageDialog(null,"ERRORpceinss : " + e.getMessage() + "\n");
		}
    	catch (SAXException e) 
    	{
            JOptionPane.showMessageDialog(null,"ERRORsaxinss : " + e.getMessage() + "\n");
    		
		} 
		catch (IOException e) 
		{
                    JOptionPane.showMessageDialog(null,"ERRORioinss : " + e.getMessage() + "\n");
		}
		
		//read AdminPassword.xml file
		readXml();
               
               //end
               * */
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocation(500,225);
                setResizable(false);
                
                setVisible(true);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Old Password");

        jLabel2.setText("New Password");

        jLabel3.setText("Confirm Password");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton2)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pswd = readTxt("AdminPassword.txt");
        if(jPasswordField1.getText().equals(pswd))
        {
            if(jPasswordField3.getText().equals(jPasswordField2.getText()))
            {
                //saveXml(jPasswordField2.getText());
                saveTxt();
                setVisible(false);
                new AdminLogin();
                //readXml();
                pswd = readTxt("AdminPassword.txt");
                JOptionPane.showMessageDialog(null,"New Password is: "+pswd);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Wrong Confirmation of Password");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jPasswordField3.setText("");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Wrong Old of Password");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jPasswordField3.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
                new AdminLogin();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
	/*public void readXml()
	{
		File xmlFile = new File("AdminPassword.xml");
		docFactory = DocumentBuilderFactory.newInstance();
		try 
		{
			docBuilder = docFactory.newDocumentBuilder();
			doc = docBuilder.parse(xmlFile);
			nList = doc.getElementsByTagName("Pswd");
				
			//read all tag values from XML file
			for (int temp = 0; temp < nList.getLength(); temp++) 
			{
				
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					
					Element eElement = (Element) nNode;
					pswd = getTagValue("password", eElement);
				}	
			}	
				
		} 
		catch (ParserConfigurationException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		catch (SAXException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		catch (IOException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}	
		
	/*
	 * utility method called by readXml() method
	 
	private static String getTagValue(String sTag, Element eElement) 
	{
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		//return the tag value requested
		return nValue.getNodeValue();
	}
        
        public void saveXml(String newPassword)
	{
		//get all the child tag of parent tag Pswd
		NodeList list1 = Pswd.getChildNodes();
		 
		//set the tag values with field values 
		for (int i = 0; i < list1.getLength(); i++) 
		{
			
           Node node = list1.item(i);
		   if("password".equalsIgnoreCase(node.getNodeName()))
		   {
			   node.setTextContent(newPassword);
		   }
		}
	
		//make these changes to XML file
		try 
		{
			transformerFactory = TransformerFactory.newInstance();
			transformer = transformerFactory.newTransformer();
			source = new DOMSource(doc);
			result = new StreamResult(xmlFile);
			transformer.transform(source, result);
		}
		catch (TransformerConfigurationException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	
		catch (TransformerException e) 
		{
			 JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, "Password successfully saved");
	}*/

    private void saveTxt() {
        
        try{
            File file = new File("AdminPassword.txt");
        
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
                            //Write labels and corresponding fields to text file
                             BufferedWriter outfile = new BufferedWriter(fw);
                             outfile.write(jPasswordField2.getText());
                             outfile.close();
    }catch(IOException io)
    {
        JOptionPane.showMessageDialog(null,io.getMessage());
    }
        JOptionPane.showMessageDialog(null,"Password Saved Successfully!!");
    }

    private String readTxt(String filename) {
       String content = null;
   File file = new File(filename); //for ex foo.txt
   
   try {
       FileReader reader = new FileReader(file);
       char[] chars = new char[(int) file.length()];
       reader.read(chars);
       content = new String(chars);
       reader.close();
   } catch (IOException e) {
       e.printStackTrace();
   }
   return content;
    }
}
