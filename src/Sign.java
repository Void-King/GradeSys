
import java.io.*;
import java.util.Scanner;
import java.util.Vector;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Sign extends Application{
	
	//��½����
	public void start(Stage x) {
		Button bts = new Button("��½");
		bts.setMinSize(120, 30);
		GridPane Login = new GridPane();
		TextField zh = new TextField();
		zh.setMinSize(160, 30);
		zh.setMaxSize(160, 30);
		
		PasswordField mm = new PasswordField();
		mm.setMinSize(160, 30);
		mm.setMaxSize(160, 30);
		
		bts.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				
				String a = zh.getText();
				String b = mm.getText();
				if (checkLogin(a,b) == 1) {
					x.close();
					secS();
					
				}
				else if (checkLogin(a,b) == 2) {
					x.close();
					thrS(a);
					
				}
				else if (checkLogin(a,b) == 3) {
					x.close();
					fouS();
					
				}
				else alertForm("�˺��������\n����������");
				
			}
			
			
		});
		
		Label zht = new Label("�˺ţ�");
		zht.setFont(Font.font(15));
		Label mmt = new Label("���룺");
		mmt.setFont(Font.font(15));
		Login.add(zht, 0, 0);
		Login.add(mmt, 0, 1);
		Login.add(zh, 1, 0);
		Login.add(mm, 1, 1);
		Login.add(bts, 1, 2);
		Login.setHgap(10);
		Login.setVgap(10);
		Login.setAlignment(Pos.CENTER);
		Login.setHalignment(bts, HPos.CENTER);

		Scene xs = new Scene(Login,250,150);
		x.getIcons().add(new Image("ico.png"));
		x.setTitle("��½");
		x.setScene(xs);
		x.show();
	}
	
	//����½����
	public int checkLogin(String a,String b) {
		int temp = 0;
		try {
			File f = new File("Person.txt");
			Scanner in = new Scanner(f);
			while(in.hasNext()) {
				String zh = in.next();
				String mm = in.next();
				if(zh.equals(a)&&mm.equals(b)) {
					if(a.charAt(0) == 't')
						temp = 1;
					if(a.charAt(0) == 's')
						temp = 2;
					if(a.charAt(0) == 'a')
						temp = 3;
				}
				
			}
			
		}
		catch(Exception e) {
			
		}
		return temp;
		
		
	}
	
	
	
	//1.����Ա
	
	
	//1.����Ա����
	public void fouS() {
		Stage y = new Stage();
		GridPane adminP = new GridPane();
		Button bt1 = new Button(" �����û�");
		Button bt2 = new Button(" ɾ���û�");
		Button bt3 = new Button(" ����û�");
		Button bt4 = new Button(" �޸��û�");
		bt1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				adAddUser();
			}
			
			
		});
		bt2.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				adDelUser();
			}
			
			
		});
		bt4.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				adChaUser();
			}
			
			
		});
		bt3.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				adScaUser();
			}
			
			
		});
		
		bt1.setMinSize(200, 60);
		bt2.setMinSize(200, 60);
		bt3.setMinSize(200, 60);
		bt4.setMinSize(200, 60);
		
		adminP.add(bt1, 1, 0);
		adminP.add(bt2, 1, 1);
		adminP.add(bt4, 0, 1);
		adminP.add(bt3, 0, 0);
		adminP.setAlignment(Pos.CENTER);
		adminP.setHgap(10);
		adminP.setVgap(10);
		Scene ys = new Scene(adminP,500,240);
		y.getIcons().add(new Image("ico.png"));
		y.setScene(ys);
		y.setTitle("����Ա");
		y.show();
		
	}
	
	
	//��ʦ����
	public void secS() {
		Stage y = new Stage();
	    GridPane adminP = new GridPane();
	    Button bt1 = new Button(" ����ѧ���ɼ�");
	    Button bt2 = new Button(" ɾ��ѧ���ɼ�");
	    Button bt3 = new Button(" �޸�ѧ���ɼ�");
	    Button bt4 = new Button(" ��ѯѧ���ɼ�");
	    Button bt5 = new Button(" �ɼ��������");
	    
	    bt1.setOnAction(new EventHandler<ActionEvent>(){
		    @Override
		    public void handle(ActionEvent e) {
			    StuAddStu();
		    }
		
		
	    });
	    bt2.setOnAction(new EventHandler<ActionEvent>(){
		    @Override
		    public void handle(ActionEvent e) {
			    StuDeStu();
	        }
		
		
	    });
	    bt3.setOnAction(new EventHandler<ActionEvent>(){
		    @Override
		    public void handle(ActionEvent e) {
			    StuUpStu();
		    }
		
		
	    });
	    bt4.setOnAction(new EventHandler<ActionEvent>(){
		    @Override
		    public void handle(ActionEvent e) {
			    StuSeStu();
		    }
		
		
	    });
	    bt5.setOnAction(new EventHandler<ActionEvent>(){
		    @Override
		    public void handle(ActionEvent e) {
			    StuSortStu();
		    }
		
		
	    });
	
	    bt1.setMinSize(200, 60);
	    bt2.setMinSize(200, 60);
	    bt3.setMinSize(200, 60);
	    bt4.setMinSize(200, 60);
	    bt5.setMinSize(200, 60);
	
	    adminP.add(bt1, 0, 1);
	    adminP.add(bt2, 0, 2);
	    adminP.add(bt3, 0, 3);
	    adminP.add(bt4, 0, 4);
	    adminP.add(bt5, 0, 5);
	    adminP.setAlignment(Pos.CENTER);
	    adminP.setHgap(10);
	    adminP.setVgap(10);
	    Scene ys = new Scene(adminP,300,400);
	    y.getIcons().add(new Image("ico.png"));
	    y.setScene(ys);
	    y.setTitle("��ʦ");
	    y.show();
		
	}
	//ѧ������
	public void thrS(String stid) {
		Stage y = new Stage();
		GridPane adminP = new GridPane();
	    Button bt1 = new Button(" ��ѯѧ���ɼ�");
	    Button bt2 = new Button(" �ɼ��������");
	    
	    bt1.setOnAction(new EventHandler<ActionEvent>(){
		    @Override
		    public void handle(ActionEvent e) {
			    StuSeStu(stid);
		    }
		
		
	    });
	    bt2.setOnAction(new EventHandler<ActionEvent>(){
		    @Override
		    public void handle(ActionEvent e) {
			    StuSortStu();
	        }
		
		
	    });
	
	    bt1.setMinSize(200, 60);
	    bt2.setMinSize(200, 60);
	
	    adminP.add(bt1, 0, 0);
	    adminP.add(bt2, 0, 1);
	    adminP.setAlignment(Pos.CENTER);
	    adminP.setHgap(10);
	    adminP.setVgap(10);
	    Scene ys = new Scene(adminP,300,200);
	    y.getIcons().add(new Image("ico.png"));
	    y.setScene(ys);
	    y.setTitle("ѧ��:" + stid);
	    y.show();
		
	}		
	
	
	//1.1����Ա�����û�
	public void adAddUser() {
		Stage y = new Stage();
		
		
		GridPane adminP = new GridPane();
		
		Button bt1 = new Button("����");
		bt1.setMinSize(120, 30);
		TextField zh = new TextField();
		zh.setMinSize(160, 30);
		zh.setMaxSize(160, 30);
		
		PasswordField mm = new PasswordField();
		mm.setMinSize(160, 30);
		mm.setMaxSize(160, 30);
		
		
		
		bt1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				String xzh = zh.getText();
				String xmm = mm.getText();
				int excheck = 0;
				try {
					File fe = new File("Person.txt");
					Scanner ine = new Scanner(fe);
					while (ine.hasNext()) {
						String zh = ine.next();
						String mm = ine.next();
						if (xzh.equals(zh)) {
							alertForm("�˺��Ѵ���!");
							excheck = 1;
							y.close();
						}
						
					}
				}
				catch(Exception e1) {
					
				}
				
				
				if (excheck == 0) {
					addUser(xzh,xmm);
					
					y.close();
				}
				
			}
			
			
			
		});
		
		Label zht = new Label("�˺ţ�");
		zht.setFont(Font.font(15));
		Label mmt = new Label("���룺");
		mmt.setFont(Font.font(15));
		
		adminP.add(zht, 0, 0);
		adminP.add(mmt, 0, 1);
		adminP.add(zh, 1, 0);
		adminP.add(mm, 1, 1);
		adminP.add(bt1, 1, 2);
		
		
		adminP.setHgap(10);
		adminP.setVgap(10);
		adminP.setAlignment(Pos.CENTER);
		adminP.setHalignment(bt1, HPos.CENTER);
		Scene xs = new Scene(adminP,250,150);
		y.getIcons().add(new Image("ico.png"));
		y.setTitle("�����û�");
		y.setScene(xs);
		y.show();
		
		
	}
	//1.1.1�����û�����
	public void addUser(String a,String b) {
		
		
		try {
			
			if (a.charAt(0) != 's' && a.charAt(0) != 't'){
				alertForm("�˺Ÿ�ʽ����\n������ѧ��:\"s__\"\n���߽�ʦ:\"t__\"");
					
			}
			else {
				File f = new File("Person.txt");
				File ft = new File("PersonTemp.ini");
				Scanner in1 = new Scanner(f);
				
				PrintWriter out1 = new PrintWriter(ft);
				
				while (in1.hasNext()) {
					String zh = in1.next();
					String mm = in1.next();
					
					out1.write(zh);
					out1.write("\n" + mm + "\n");
					
				}
				in1.close();
				out1.close();
				
				Scanner in2 = new Scanner(ft);
				
				PrintWriter out2 = new PrintWriter(f);
				while (in2.hasNext()) {
					String zh = in2.next();
					String mm = in2.next();
					out2.write(zh);
					out2.write("\n" + mm + "\n");
					
				}
				out2.write(a);
				out2.write("\n" + b + "\n");
				out2.close();
				alertForm("���ӳɹ���");
			}
			
			
		}
		catch(Exception e) {
			
		}
		
	}
	
	//1.2����Աɾ���û�
	
	public void adDelUser() {
		Stage y = new Stage();
		
		
		GridPane adminP = new GridPane();
		
		Button bt1 = new Button("ɾ��");
		bt1.setMinSize(120, 30);
		TextField zh = new TextField();
		zh.setMinSize(160, 30);
		zh.setMaxSize(160, 30);
		
		
		
		bt1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				String xzh = zh.getText();
				
				int excheck = 0;
				try {
					File fe = new File("Person.txt");
					Scanner ine = new Scanner(fe);
					while (ine.hasNext()) {
						String zh = ine.next();
						String mm = ine.next();
						if (xzh.equals(zh)) {
							excheck = 1;
							y.close();
						}
						
					}
				}
				catch(Exception e1) {
					
				}
				if (excheck == 0) {
					alertForm("�˺Ų�����!");
				}
				
				if (excheck == 1) {
					delUser(xzh);
					
					y.close();
				}
				
			}
			
			
			
		});
		
		
		Label zht = new Label("�˺ţ�");
		zht.setFont(Font.font(15));
		
		adminP.add(zht, 0, 0);
		adminP.add(zh, 1, 0);
		adminP.add(bt1, 1, 1);
		
		
		adminP.setHgap(10);
		adminP.setVgap(10);
		adminP.setAlignment(Pos.CENTER);
		adminP.setHalignment(bt1, HPos.CENTER);
		Scene xs = new Scene(adminP,250,150);
		y.getIcons().add(new Image("ico.png"));
		y.setTitle("ɾ���û�");
		y.setScene(xs);
		y.show();
		
		
	}
	//1.2.1ɾ���û�����
	public void delUser(String a) {
		
		
		try {
			
			if (a.charAt(0) != 's' && a.charAt(0) != 't'){
				alertForm("�˺Ÿ�ʽ����\n������ѧ��:\"s__\"\n���߽�ʦ:\"t__\"");
					
			}
			else {
				File f = new File("Person.txt");
				File ft = new File("PersonTemp.ini");
				Scanner in1 = new Scanner(f);
				
				PrintWriter out1 = new PrintWriter(ft);
				
				while (in1.hasNext()) {
					String zh = in1.next();
					String mm = in1.next();
					if (zh.equals(a)) continue;
					out1.write(zh);
					out1.write("\n" + mm + "\n");
					
				}
				in1.close();
				out1.close();
				
				Scanner in2 = new Scanner(ft);
				
				PrintWriter out2 = new PrintWriter(f);
				while (in2.hasNext()) {
					String zh = in2.next();
					String mm = in2.next();
					out2.write(zh);
					out2.write("\n" + mm + "\n");
					
				}
				out2.close();
				alertForm("ɾ���ɹ���");
			}
			
			
		}
		catch(Exception e) {
			
		}
		
	}
	//1.3����Ա�޸��û�
	public void adChaUser() {
		Stage y = new Stage();
		
		
		GridPane adminP = new GridPane();
		
		Button bt1 = new Button("�޸�");
		bt1.setMinSize(120, 30);
		TextField zh = new TextField();
		zh.setMinSize(160, 30);
		zh.setMaxSize(160, 30);
		TextField mm = new TextField();
		mm.setMinSize(160, 30);
		mm.setMaxSize(160, 30);
		
		
		bt1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				String xzh = zh.getText();
				String xmm = mm.getText();
				int excheck = 0;
				try {
					File fe = new File("Person.txt");
					Scanner ine = new Scanner(fe);
					while (ine.hasNext()) {
						String zh = ine.next();
						String mm = ine.next();
						if (xzh.equals(zh)) {
							excheck = 1;
							y.close();
						}
						
					}
				}
				catch(Exception e1) {
					
				}
				if (excheck == 0) {
					alertForm("�˺Ų�����!");
				}
				
				if (excheck == 1) {
					chaUser(xzh,xmm);
					
					y.close();
				}
				
			}
			
			
			
		});
		
		
		Label zht = new Label("�˺ţ�");
		zht.setFont(Font.font(15));
		Label mmt = new Label("���룺");
		mmt.setFont(Font.font(15));
		
		adminP.add(zht, 0, 0);
		adminP.add(mmt, 0, 1);
		adminP.add(zh, 1, 0);
		adminP.add(mm, 1, 1);
		adminP.add(bt1, 1, 2);
		
		
		adminP.setHgap(10);
		adminP.setVgap(10);
		adminP.setAlignment(Pos.CENTER);
		adminP.setHalignment(bt1, HPos.CENTER);
		Scene xs = new Scene(adminP,250,150);
		y.getIcons().add(new Image("ico.png"));
		y.setTitle("�޸��û�");
		y.setScene(xs);
		y.show();
		
		
	}
	//1.3.1�޸��û�����
	public void chaUser(String a,String b) {
		
		
		try {
			
			if (a.charAt(0) != 's' && a.charAt(0) != 't'){
				alertForm("�˺Ÿ�ʽ����\n������ѧ��:\"s__\"\n���߽�ʦ:\"t__\"");
					
			}
			else {
				File f = new File("Person.txt");
				File ft = new File("PersonTemp.ini");
				Scanner in1 = new Scanner(f);
				
				PrintWriter out1 = new PrintWriter(ft);
				
				while (in1.hasNext()) {
					String zh = in1.next();
					String mm = in1.next();
					if (zh.equals(a)) continue;
					out1.write(zh);
					out1.write("\n" + mm + "\n");
					
				}
				in1.close();
				out1.close();
				
				Scanner in2 = new Scanner(ft);
				
				PrintWriter out2 = new PrintWriter(f);
				while (in2.hasNext()) {
					String zh = in2.next();
					String mm = in2.next();
					out2.write(zh);
					out2.write("\n" + mm + "\n");
					
				}
				out2.write(a);
				out2.write("\n" + b + "\n");
				out2.close();
				alertForm("�޸ĳɹ���");
			}
			
			
		}
		catch(Exception e) {
			
		}
		
	}
	//1.4����Ա����û�
	public void adScaUser() {
		Stage UInfo = new Stage();
		GridPane zhmm = new GridPane();
		Label zh = new Label("�˺� ");
		Label mm = new Label("���� ");
		
		
		zhmm.add(zh, 0, 0);
		zhmm.add(mm, 1, 0);
		
		try {
			File f = new File("Person.txt");
			Scanner in = new Scanner(f);
			int i = 0;
			int j = 2;
			Vector<Label> la = new Vector<>();
			while (in.hasNext()){
				
				String a = in.next();
				String b = in.next();
				la.add(new Label(a));
				la.add(new Label(b));
				zhmm.add(la.get(i), 0, j);
				zhmm.add(la.get(i + 1), 1, j);
				i = i + 2;
				j++;
			}
			
		} 
		catch (Exception e) {
			
		}

		zhmm.setHgap(40);
		zhmm.setVgap(3);
		zhmm.setPadding(new Insets(8,2,5,10));
		Scene zhmms = new Scene(zhmm,240,400);
		UInfo.getIcons().add(new Image("ico.png"));
		UInfo.setScene(zhmms);
		UInfo.setTitle("����û�");;
		
		UInfo.show();
		
	}
	
	//��ʦ��ѧ����������
		//����ѧ���ɼ�
		public void StuAddStu() {
			Stage y = new Stage();
			
			
			GridPane adminP = new GridPane();
			
			Button bt1 = new Button("����");
			bt1.setMinSize(120, 30);
		    TextField Num = new TextField();
			TextField Name = new TextField();
			TextField Course = new TextField();
			TextField Grade = new TextField();
			Num.setMinSize(160, 30);
			Num.setMaxSize(160, 30);
			Name.setMinSize(160, 30);
			Name.setMaxSize(160, 30);
			Course.setMinSize(160, 30);
			Course.setMaxSize(160, 30);
			Grade.setMinSize(160, 30);
			Grade.setMaxSize(160, 30);
			
			
			bt1.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent e) {
					String StuNum = Num.getText();
					String StuName = Name.getText();
					String StuCourse = Course.getText();
					String StuGrade = Grade.getText();
					int excheck = 0;
					try {
						File fe = new File("Grade.txt");
						Scanner ine = new Scanner(fe);
						while (ine.hasNext()) {
							String A = ine.next();
							String B = ine.next();
							String C = ine.next();
							String D = ine.next();
							if (StuNum.equals(A)&&StuCourse.equals(C)){
								alertForm("�ɼ��Ѵ���!");
								excheck = 1;
								y.close();
							}
							
						}
					}
					catch(Exception e1) {
						
					}
					
					
					if (excheck == 0) {
						addStu(StuNum,StuName,StuCourse,StuGrade);
						
						y.close();
					}
					
				}
					
				
			});
			
			Label snum = new Label("ѧ�ţ�");
			snum.setFont(Font.font(15));
			Label sname = new Label("������");
			sname.setFont(Font.font(15));
			Label scourse = new Label("�γ�����");
			scourse.setFont(Font.font(15));
			Label sgrade = new Label("�ɼ���");
			sgrade.setFont(Font.font(15));
			
			adminP.add(snum, 0, 0);
			adminP.add(sname, 0, 1);
			adminP.add(scourse, 0, 2);
			adminP.add(sgrade, 0, 3);
			adminP.add(Num, 1, 0);
			adminP.add(Name, 1, 1);
			adminP.add(Course, 1, 2);
			adminP.add(Grade, 1, 3);
			adminP.add(bt1, 1, 4);
			
			
			adminP.setHgap(10);
			adminP.setVgap(10);
			adminP.setAlignment(Pos.CENTER);
			adminP.setHalignment(bt1, HPos.CENTER);
			Scene xs = new Scene(adminP,300,350);
			y.getIcons().add(new Image("ico.png"));
			y.setTitle("����ѧ���ɼ�");
			y.setScene(xs);
			y.show();
			
			
		}
		//����ѧ���ɼ�����
		public void addStu(String a,String b,String c,String d) {
			
			
			try {
				
				if (a.charAt(0) != 's' ){
					alertForm("ѧ�Ÿ�ʽ����\n������ѧ��:\"s__\"");
						
				}
				else {
					File f = new File("Grade.txt");
					File ft = new File("GradeTemp.ini");
					Scanner in1 = new Scanner(f);
					
					PrintWriter out1 = new PrintWriter(ft);
					
					while (in1.hasNext()) {
						String A = in1.next();
						String B = in1.next();
						String C = in1.next();
						String D = in1.next();
						
						out1.write(A + "\n");
						out1.write(B + "\n");
						out1.write(C + "\n");
						out1.write(D + "\n");
						
					}
					in1.close();
					out1.close();
					
					Scanner in2 = new Scanner(ft);
					
					PrintWriter out2 = new PrintWriter(f);
					while (in2.hasNext()) {
						String A = in2.next();
						String B = in2.next();
						String C = in2.next();
						String D = in2.next();
						
						out2.write(A + "\n");
						out2.write(B + "\n");
						out2.write(C + "\n");
						out2.write(D + "\n");
						
					}
					out2.write(a + "\n");
					out2.write(b + "\n");
					out2.write(c + "\n");
					out2.write(d + "\n");
					in2.close();
					out2.close();
					alertForm("���ӳɹ���");
				}
				
				
			}
			catch(Exception e) {
				
			}
			
		}
		
		//ɾ��ѧ���ɼ�
		
		public void StuDeStu() {
			Stage y = new Stage();
			
			
			GridPane adminP = new GridPane();
			
			Button bt1 = new Button("ɾ��");
			bt1.setMinSize(120, 30);
			TextField Num = new TextField();
			TextField Name = new TextField();
			TextField Course = new TextField();
			TextField Grade = new TextField();
			Num.setMinSize(160, 30);
			Num.setMaxSize(160, 30);
			Name.setMinSize(160, 30);
			Name.setMaxSize(160, 30);
			Course.setMinSize(160, 30);
			Course.setMaxSize(160, 30);
			Grade.setMinSize(160, 30);
			Grade.setMaxSize(160, 30);
			
			
			
			bt1.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent e) {
					String StuNum = Num.getText();
					String StuName = Name.getText();
					String StuCourse = Course.getText();
					String StuGrade = Grade.getText();
					int excheck = 0;
					try {
						File fe = new File("Grade.txt");
						Scanner ine = new Scanner(fe);
						while (ine.hasNext()) {
							String A = ine.next();
							String B = ine.next();
							String C = ine.next();
							String D = ine.next();
							if (StuNum.equals(A)&&StuCourse.equals(C)){
								excheck = 1;
								y.close();
							}
							
						}
					}
					catch(Exception e1) {
						
					}
					if (excheck == 0) {
						alertForm("�ɼ�������!");
					}
					
					if (excheck == 1) {
						delStu(StuNum,StuName,StuCourse,StuGrade);
						
						y.close();
					}
					
				}
				
				
				
			});
			
			
			Label snum = new Label("ѧ�ţ�");
			snum.setFont(Font.font(15));
			Label scourse = new Label("�γ�����");
			scourse.setFont(Font.font(15));
			
			adminP.add(snum, 0, 0);
			adminP.add(scourse, 0, 1);
			adminP.add(Num, 1, 0);
			adminP.add(Course, 1, 1);
			adminP.add(bt1, 1, 2);
			
			
			adminP.setHgap(10);
			adminP.setVgap(10);
			adminP.setAlignment(Pos.CENTER);
			adminP.setHalignment(bt1, HPos.CENTER);
			Scene xs = new Scene(adminP,300,350);
			y.getIcons().add(new Image("ico.png"));
			y.setTitle("ɾ��ѧ���ɼ�");
			y.setScene(xs);
			y.show();
			
			
		}
		//ɾ��ѧ���ɼ�����
		public void delStu(String a,String b,String c,String d) {
			
			
			try {
				
				if (a.charAt(0) != 's'){
					alertForm("ѧ�Ÿ�ʽ����\n������ѧ��:\"s__\"");
						
				}
				else {
					File f = new File("Grade.txt");
					File ft = new File("GradeTemp.ini");
					Scanner in1 = new Scanner(f);
					
					PrintWriter out1 = new PrintWriter(ft);
					
					while (in1.hasNext()) {
						String A = in1.next();
						String B = in1.next();
						String C = in1.next();
						String D = in1.next();
						if (a.equals(A)&&c.equals(C)) continue;
						out1.write(A + "\n");
						out1.write(B + "\n");
						out1.write(C + "\n");
						out1.write(D + "\n");
						
					}
					in1.close();
					out1.close();
					
					Scanner in2 = new Scanner(ft);
					
					PrintWriter out2 = new PrintWriter(f);
					while (in2.hasNext()) {
						String A = in2.next();
						String B = in2.next();
						String C = in2.next();
						String D = in2.next();
						
						out2.write(A + "\n");
						out2.write(B + "\n");
						out2.write(C + "\n");
						out2.write(D + "\n");
						
					}
					in2.close();
					out2.close();
					alertForm("ɾ���ɹ���");
				}
				
				
			}
			catch(Exception e) {
				
			}
			
		}
		//�޸�ѧ���ɼ�
		public void StuUpStu() {
			Stage y = new Stage();
			
			
			GridPane adminP = new GridPane();
			
			Button bt1 = new Button("�޸�");
			bt1.setMinSize(120, 30);
			TextField Num = new TextField();
			TextField Name = new TextField();
			TextField Course = new TextField();
			TextField Grade = new TextField();
			Num.setMinSize(160, 30);
			Num.setMaxSize(160, 30);
			Name.setMinSize(160, 30);
			Name.setMaxSize(160, 30);
			Course.setMinSize(160, 30);
			Course.setMaxSize(160, 30);
			Grade.setMinSize(160, 30);
			Grade.setMaxSize(160, 30);
			
			
			bt1.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent e) {
					String StuNum = Num.getText();
					String StuName = Name.getText();
					String StuCourse = Course.getText();
					String StuGrade = Grade.getText();
					int excheck = 0;
					try {
						File fe = new File("Grade.txt");
						Scanner ine = new Scanner(fe);
						while (ine.hasNext()) {
							String A = ine.next();
							String B = ine.next();
							String C = ine.next();
							String D = ine.next();
							if (StuNum.equals(A)&&StuCourse.equals(C)){
								excheck = 1;
								StuName = B;
								y.close();
							}
							
						}
					}
					catch(Exception e1) {
						
					}
					if (excheck == 0) {
						alertForm("�ɼ�������!");
					}
					
					if (excheck == 1) {
						UpStu(StuNum,StuName,StuCourse,StuGrade);
						
						y.close();
					}
					
				}
				
				
				
			});
			
			
			Label snum = new Label("ѧ�ţ�");
			snum.setFont(Font.font(15));
			Label scourse = new Label("�γ�����");
			scourse.setFont(Font.font(15));
			Label sgrade = new Label("�޸ĳɼ���");
			sgrade.setFont(Font.font(15));
			
			adminP.add(snum, 0, 0);
			adminP.add(scourse, 0, 1);
			adminP.add(sgrade, 0, 2);
			adminP.add(Num, 1, 0);
			adminP.add(Course, 1, 1);
			adminP.add(Grade, 1, 2);
			adminP.add(bt1, 1, 3);
			
			
			adminP.setHgap(10);
			adminP.setVgap(10);
			adminP.setAlignment(Pos.CENTER);
			adminP.setHalignment(bt1, HPos.CENTER);
			Scene xs = new Scene(adminP,300,350);
			y.getIcons().add(new Image("ico.png"));
			y.setTitle("�޸�ѧ���ɼ�");
			y.setScene(xs);
			y.show();
			
			
		}
		//�޸�ѧ���ɼ�����
		public void UpStu(String a,String b,String c,String d) {
			
			
			try {
				
				if (a.charAt(0) != 's'){
					alertForm("ѧ�Ÿ�ʽ����\n������ѧ��:\"s__\"");
						
				}
				else {
					File f = new File("Grade.txt");
					File ft = new File("GradeTemp.ini");
					Scanner in1 = new Scanner(f);
					
					PrintWriter out1 = new PrintWriter(ft);
					
					while (in1.hasNext()) {
						String A = in1.next();
						String B = in1.next();
						String C = in1.next();
						String D = in1.next();
						if (a.equals(A)&&c.equals(C)) continue;
						out1.write(A + "\n");
						out1.write(B + "\n");
						out1.write(C + "\n");
						out1.write(D + "\n");
						
					}
					in1.close();
					out1.close();
					
					Scanner in2 = new Scanner(ft);
					
					PrintWriter out2 = new PrintWriter(f);
					while (in2.hasNext()) {
						String A = in2.next();
						String B = in2.next();
						String C = in2.next();
						String D = in2.next();
						
						out2.write(A + "\n");
						out2.write(B + "\n");
						out2.write(C + "\n");
						out2.write(D + "\n");
						
					}
					out2.write(a + "\n");
					out2.write(b + "\n");
					out2.write(c + "\n");
					out2.write(d + "\n");
					in2.close();
					out2.close();
					alertForm("�޸ĳɹ���");
				}
				
				
			}
			catch(Exception e) {
				
			}
			
		}
		//��ѯѧ���ɼ�
		public void StuSeStu() {
			Stage y = new Stage();
			
			
			GridPane adminP = new GridPane();
			
			Button bt1 = new Button("��ѯ");
			bt1.setMinSize(120, 30);
			TextField Num = new TextField();
			TextField Name = new TextField();
			TextField Course = new TextField();
			TextField Grade = new TextField();
			Num.setMinSize(160, 30);
			Num.setMaxSize(160, 30);
			Name.setMinSize(160, 30);
			Name.setMaxSize(160, 30);
			Course.setMinSize(160, 30);
			Course.setMaxSize(160, 30);
			Grade.setMinSize(160, 30);
			Grade.setMaxSize(160, 30);
			
			
			bt1.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent e) {
					String StuNum = Num.getText();
					String StuName = Name.getText();
					String StuCourse = Course.getText();
					String StuGrade = Grade.getText();
					int excheck = 0;
					try {
						File fe = new File("Grade.txt");
						Scanner ine = new Scanner(fe);
						while (ine.hasNext()) {
							String A = ine.next();
							String B = ine.next();
							String C = ine.next();
							String D = ine.next();
							if (StuNum.equals(A)&&StuCourse.equals(C)){
								excheck = 1;
								y.close();
							}
							
						}
					}
					catch(Exception e1) {
						
					}
					if (excheck == 0) {
						alertForm("�ɼ�������!");
					}
					
					if (excheck == 1) {
						SeStu(StuNum,StuName,StuCourse,StuGrade);
						
						y.close();
					}
					
				}
				
				
				
			});
			
			
			Label snum = new Label("ѧ�ţ�");
			snum.setFont(Font.font(15));
			Label scourse = new Label("�γ�����");
			scourse.setFont(Font.font(15));
			
			adminP.add(snum, 0, 0);
			adminP.add(scourse, 0, 1);
			adminP.add(Num, 1, 0);
			adminP.add(Course, 1, 1);
			adminP.add(bt1, 1, 2);
			
			
			adminP.setHgap(10);
			adminP.setVgap(10);
			adminP.setAlignment(Pos.CENTER);
			adminP.setHalignment(bt1, HPos.CENTER);
			Scene xs = new Scene(adminP,300,350);
			y.getIcons().add(new Image("ico.png"));
			y.setTitle("��ѯѧ���ɼ�");
			y.setScene(xs);
			y.show();
		}
		
		//��ѯѧ���ɼ�with stuid
		public void StuSeStu(String stid) {
			Stage y = new Stage();
			
			
			GridPane adminP = new GridPane();
			
			Button bt1 = new Button("��ѯ");
			bt1.setMinSize(120, 30);
			TextField Num = new TextField();
			TextField Name = new TextField();
			TextField Course = new TextField();
			TextField Grade = new TextField();
			Num.setMinSize(160, 30);
			Num.setMaxSize(160, 30);
			Name.setMinSize(160, 30);
			Name.setMaxSize(160, 30);
			Course.setMinSize(160, 30);
			Course.setMaxSize(160, 30);
			Grade.setMinSize(160, 30);
			Grade.setMaxSize(160, 30);
			
			
			bt1.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent e) {
					String StuNum = Num.getText();
					String StuName = Name.getText();
					String StuCourse = Course.getText();
					String StuGrade = Grade.getText();
					int excheck = 0;
					try {
						File fe = new File("Grade.txt");
						Scanner ine = new Scanner(fe);
						while (ine.hasNext()) {
							String A = ine.next();
							String B = ine.next();
							String C = ine.next();
							String D = ine.next();
							if (stid.equals(A)&&StuCourse.equals(C)){
								excheck = 1;
								y.close();
							}
							
						}
					}
					catch(Exception e1) {
						
					}
					if (excheck == 0) {
						alertForm("�ɼ�������!");
					}
					
					if (excheck == 1) {
						SeStu(stid,StuName,StuCourse,StuGrade);
						
						y.close();
					}
					
				}
				
				
				
			});
			
			
			Label scourse = new Label("�γ�����");
			scourse.setFont(Font.font(15));
			
			adminP.add(scourse, 0, 1);
			adminP.add(Course, 1, 1);
			adminP.add(bt1, 1, 2);
			
			
			adminP.setHgap(10);
			adminP.setVgap(10);
			adminP.setAlignment(Pos.CENTER);
			adminP.setHalignment(bt1, HPos.CENTER);
			Scene xs = new Scene(adminP,300,350);
			y.getIcons().add(new Image("ico.png"));
			y.setTitle("��ѯѧ���ɼ�");
			y.setScene(xs);
			y.show();
		}		
		
		
		//��ѯѧ���ɼ�����
		public void SeStu(String a,String b,String c,String d) {
			
			
			try {
				
				if (a.charAt(0) != 's'){
					alertForm("ѧ�Ÿ�ʽ����\n������ѧ��:\"s__\"");
						
				}
				else {
					File f = new File("Grade.txt");
					File ft = new File("GradeTemp.ini");
					Scanner in1 = new Scanner(f);
					while (in1.hasNext()) {
						String A = in1.next();
						String B = in1.next();
						String C = in1.next();
						String D = in1.next();
						if (a.equals(A)&&c.equals(C)){
							alertForm("ѧ�ţ�" + A + "\n������" + B + "\n�γ�����" + C +"\n�ɼ���" + D);
						}
						
					}
					in1.close();
					
				}
				
				
			}
			catch(Exception e) {
				
			}
			
		}
	
		//����ɼ�����
		public void StuSortStu() {
			Stage y = new Stage();
			
			
			GridPane adminP = new GridPane();
			
			Button bt1 = new Button("��ѯ");
			bt1.setMinSize(120, 30);
			TextField Course = new TextField();
			Course.setMinSize(160, 30);
			Course.setMaxSize(160, 30);
			
			
			bt1.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent e) {
					String StuCourse = Course.getText();
					int excheck = 0;
					try {
						File fe = new File("Grade.txt");
						Scanner ine = new Scanner(fe);
						while (ine.hasNext()) {
							String A = ine.next();
							String B = ine.next();
							String C = ine.next();
							String D = ine.next();
							if (StuCourse.equals(C)){
								excheck = 1;
								y.close();
							}
							
						}
					}
					catch(Exception e1) {
						
					}
					if (excheck == 0) {
						alertForm("�γ̲�����!");
					}
					
					if (excheck == 1) {
						scaSort(StuCourse);
						
						y.close();
					}
					
				}
				
				
				
			});
			
			
			Label scourse = new Label("�γ�����");
			scourse.setFont(Font.font(15));
			
			adminP.add(scourse, 0, 0);
			adminP.add(Course, 1, 0);
			adminP.add(bt1, 1, 1);
			
			
			adminP.setHgap(10);
			adminP.setVgap(10);
			adminP.setAlignment(Pos.CENTER);
			adminP.setHalignment(bt1, HPos.CENTER);
			Scene xs = new Scene(adminP,300,350);
			y.getIcons().add(new Image("ico.png"));
			y.setTitle("����ɼ�����");
			y.setScene(xs);
			y.show();
		}	
			
	
	
	
	
	
	
	
	//��������
	public void alertForm(String s) {
		Stage y1 = new Stage();
		Button bty1 = new Button(s);
		bty1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				
				y1.close();
			}
			
		});
		
		Scene ys = new Scene(bty1,240,100);
		y1.getIcons().add(new Image("ico.png"));
		y1.setScene(ys);
		y1.show();
		
	}
	//�鿴����
	
	public void scaSort(String course) {
		Stage UInfo = new Stage();
		GridPane zhmm = new GridPane();
		GridPane zhmmt = new GridPane();
		GridPane zhmmi = new GridPane();
		Label pm = new Label("���� ");
		Label xh = new Label("ѧ�� ");
		Label nm = new Label("���� ");
		Label gr = new Label("�ɼ� ");
		pm.setMinWidth(30);
		nm.setMinWidth(30);
		gr.setMinWidth(30);
		xh.setMinWidth(30);
		
		zhmmt.add(pm, 0, 0);
		zhmmt.add(xh, 1, 0);
		zhmmt.add(nm, 2, 0);
		zhmmt.add(gr, 3, 0);
		ScrollPane sp = new ScrollPane();
		sp.setMinSize(260, 0);
		try {
			File f = new File("Grade.txt");
			Scanner in = new Scanner(f);
			Vector<stu> st = new Vector<>();
			while (in.hasNext()){
				
				String a = in.next();
				String b = in.next();
				String c = in.next();
				double d = in.nextDouble();
				if (c.equals(course))
					st.add(new stu(a,b,c,d));
				else continue;
			}
			in.close();
			int stlength = st.size();
			stu[] stsd = new stu[stlength];
			for (int i1 = 0;i1 < stlength;i1++) {
				stsd[i1] = st.get(i1);
				
			}
			stuSort(stsd);
			for (int i2 = 0;i2 < stlength;i2++) {
				Label l1 = new Label("" + (i2 + 1));
				Label l2 = new Label(stsd[stlength - i2 - 1].sno);
				Label l3 = new Label(stsd[stlength - i2 - 1].name);
				Label l4 = new Label("" + stsd[stlength - i2 - 1].grade);
				l1.setMinWidth(32);
				l2.setMinWidth(32);
				l3.setMinWidth(32);
				l4.setMinWidth(32);
				zhmmi.add(l1, 0, i2);
				zhmmi.add(l2, 1, i2);
				zhmmi.add(l3, 2, i2);
				zhmmi.add(l4, 3, i2);
			}
			
		} 
		catch (Exception e) {
			
		}
		sp.setContent(zhmmi);
		sp.getStyleClass().add("edge-to-edge");  
		zhmm.add(sp, 0, 1);
		zhmm.add(zhmmt, 0, 0);
		zhmm.setVgap(10);
		zhmmt.setHgap(35);
		zhmmi.setHgap(30);
		zhmmt.setVgap(3);
		
		zhmm.setPadding(new Insets(8,5,5,5));
		zhmmt.setPadding(new Insets(0,0,0,8));
		zhmmi.setPadding(new Insets(2,0,5,8));
		Scene zhmms = new Scene(zhmm,270,400);
		UInfo.getIcons().add(new Image("ico.png"));
		UInfo.setScene(zhmms);
		UInfo.setTitle(course + " ������Ϣ");;
		
		UInfo.show();
		
	}
	
	//�����㷨
	public  void stuSort(stu[] a) {
		for (int i = 0;i < a.length;i++) {
			stu curMin = a[i];
			int minIndex = i;
			
			for (int j = i + 1;j < a.length;j++) {
				if (a[j].grade < curMin.grade) {
					curMin = a[j];
					minIndex = j;
					
				}
				
				
			}
			
			if (minIndex != i) {
				a[minIndex] = a[i];
				a[i] = curMin;
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}



class stu{
	String sno;
	String name;
	String course;
	double grade;
	
	public stu(String a,String b,String c,double d) {
		sno = a;
		name = b;
		course = c;
		grade = d;
		
	}
	
	
}
