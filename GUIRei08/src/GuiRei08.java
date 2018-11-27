import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GUIRei08 extends JFrame {

	private JPanel contentPane;

	private String[] AreaName={"–kŠC“¹’n•û","“Œ–k’n•û","ŠÖ“Œ’n•û","’†•”’nˆæ","‹ß‹E’n•û","’†‘’n•û","Žl‘’n•û","‹ãB","‰«“ê’n•û"};
	private String [][] PrefectureName ={{"–kŠC“¹"},
		{"ÂXŒ§","ŠâŽèŒ§","H“cŒ§","‹{èŒ§","ŽRŒ`Œ§","•ŸŽRŒ§"},
		{"ˆïéŒ§","“È–ØŒ§","ŒQ”nŒ§","é‹ÊŒ§","ç—tŒ§","“Œ‹ž“s","_“ÞìŒ§"},
		{"ŽRŒ`Œ§","’·–ìŒ§","VŠƒŒ§","•xŽRŒ§","ÎìŒ§","•ŸˆäŒ§","Ã‰ªŒ§","ˆ¤’mŒ§","Šò•ŒŒ§"},
		{"ŽOdŒ§","Ž ‰êŒ§","‹ž“s•{","‘åã•{","•ºŒÉŒ§","“Þ—ÇŒ§","˜a‰ÌŽRŒ§"},
		{"’¹ŽæŒ§","“‡ªŒ§","‰œŽRŒ§","L“‡Œ§","ŽRŒûŒ§"},
		{"“¿“‡Œ§","ìŒ§","ˆ¤•QŒ§","‚’mŒ§"},
		{"•Ÿ‰ªŒ§","Ž ‰êŒ§","’·èŒ§","ŒF–{Œ§","‘å•ªŒ§","‹{èŒ§",
			"Ž­Ž™“‡Œ§","‰«“êŒ§"}
	};
	
	
	private String [][] CityName= {{""}};
	private JScrollPane AreaScrollPane;
	private JLabel AreaLabel;
	private JLabel PrefectureLabel;
	private JComboBox PrefectureComboBox;
	private JLabel CityLabel;
	private JButton EndButton;
	private JList AreaList;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei08 frame = new GUIRei08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIRei08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		AreaScrollPane = new JScrollPane();
		AreaScrollPane.setBounds(12, 62, 143, 152);
		contentPane.add(AreaScrollPane);
		
		AreaList = new JList(AreaName);
		AreaScrollPane.setViewportView(AreaList);
		
		AreaLabel = new JLabel("\u5730\u65B9");
		AreaLabel.setBounds(12, 28, 68, 24);
		contentPane.add(AreaLabel);
		
		PrefectureLabel = new JLabel("\u90FD\u9053\u5E9C\u770C");
		PrefectureLabel.setBounds(238, 28, 57, 24);
		contentPane.add(PrefectureLabel);
		
		PrefectureComboBox = new JComboBox();
		PrefectureComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int AreaIndex = AreaList.getSelectedIndex();
				int PrefectureIndex = PrefectureComboBox.getSelectedIndex();
				if(e.getStateChange()==ItemEvent.SELECTED
						&& AreaIndex>=0 && PrefectureIndex>=0) {
					CityLabel.setText(CityName[AreaIndex][PrefectureIndex]);
				}
			}
		});
		PrefectureComboBox.setBounds(205, 62, 156, 27);
		contentPane.add(PrefectureComboBox);
		
		CityLabel = new JLabel("\u770C\u5E81\u6240\u5728\u5730");
		CityLabel.setBounds(190, 120, 50, 13);
		contentPane.add(CityLabel);
		
		EndButton = new JButton("\u7D42\u4E86");
		EndButton.setBounds(270, 195, 91, 21);
		contentPane.add(EndButton);
		
		AreaList = new JList(AreaName);
		
		
		AreaList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				int AreaIndex=AreaList.getSelectedIndex();
				PrefectureComboBox.removeAllItems();
				for(String s:PrefectureName[AreaIndex]) {
					PrefectureComboBox.addItem(s);
				}
				PrefectureComboBox.setSelectedIndex(0);
			}
		});
		AreaList.setBounds(12, 208, 143, -140);
		contentPane.add(AreaList);
		AreaList.setSelectedIndex(0);
	}
}
