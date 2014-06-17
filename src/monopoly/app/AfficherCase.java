/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package monopoly.app;

import java.util.ArrayList;

/**
 *
 * 
 */
public class AfficherCase extends javax.swing.JFrame {

    public static boolean VientApartirDuprison=false;

    public static int position;

    
    ArrayList<Case> plateau=new ArrayList<Case>();
        ArrayList<Carte> carteChance=new ArrayList<Carte>();
        ArrayList<Carte> carteCaisee=new ArrayList<Carte>();


    public static ArrayList<Integer> CasesOccuppe=new ArrayList<Integer>();
    public static ArrayList<Integer> Proprietere=new ArrayList<Integer>();
    public static ArrayList<String> Noms=new ArrayList<String>();



    /** Creates new form AfficherCase */
    public AfficherCase() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Terminer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Acheter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        this.setResizable(false);




                plateau.add(new Case());
		plateau.add(new Case(1,"DEPART"));
		plateau.add(new Terrain(2,"BOULEVARD MANSOUR EDDAHBI", 60, 30, 2, 10, 30, 90, 160, 250, 50, 50));
		plateau.add(new Case(3,"CAISSE DE COMMUNITE"));
		plateau.add(new Terrain(4,"AVENUE DES MERINIDES", 60, 30, 4, 20, 60, 180, 320, 450, 50, 50));
		plateau.add(new Taxe(5, "IMPOT SUR LE REVENU", 200));
		plateau.add(new Gare(6, "GARE DE MARRAKECH"));
		plateau.add(new Terrain(7, "BOULEVARD MOULAY YOUSSEF", 100, 50, 6, 30, 90, 270, 400, 550, 50, 50));
		plateau.add(new Carte(8,"CHANCE",0,0));
		plateau.add(new Terrain(9, "AVENUE DES ALMOHADES", 100, 50, 6, 30, 90, 270, 400, 550, 50, 50));
		plateau.add(new Terrain(10, "RUE ALLAL BENABDELLAH", 120, 60, 8, 40, 100, 300, 450, 600, 50, 50));
		plateau.add(new Case(11,"SIMPLE VISITE DE PRISON" ));
		plateau.add(new Terrain(12, "RUE MOKHTAR SOUSSI", 140, 70, 10, 50, 150, 450, 625, 750, 100, 100));
		plateau.add(new ServicePublic(13, "ONE",150));
		plateau.add(new Terrain(14, "BOULEVARD ABDELMOUMEN", 140, 70, 10, 50, 150, 450, 625, 750, 100, 100));
		plateau.add(new Terrain(15, "BOULEVARD YACOUB EL MANSOUR", 160, 80, 12, 60, 180, 500, 700, 900, 100, 100));
		plateau.add(new Gare(16, "GARE DE TANGER"));
		plateau.add(new Terrain(17, "BOULEVARD ABDELKRIM ALKHATTABI", 180, 90, 14, 70, 200, 550, 750, 950, 100, 100));
                plateau.add(new Carte(18,"CAISSE DE COMMUNAUTE",0,0));
		plateau.add(new Terrain(19, "BOULEVARD BRAHIM ROUDANI", 180, 90, 14, 70, 200, 550, 750, 950, 100, 100));
		plateau.add(new Terrain(20, "AVENUE DES FORCES ARMEES ROYALES", 200, 100, 16, 80, 220, 600, 800, 1000, 100, 100));
                plateau.add(new Case(21,"PARK"));
		plateau.add(new Terrain(22, "AVENUE MOHAMED V", 220, 110, 18, 90, 250, 700, 875, 1050, 150, 150));
                plateau.add(new Carte(23,"CHANCE",0,0));
		plateau.add(new Terrain(24, "BOULEVARD ABDERRAHIM BOUABID", 220, 110, 18, 90, 250, 700, 875, 1050, 150, 150));
		plateau.add(new Terrain(25, "ROND POINT DES SPORTS", 240, 120, 20, 100, 300, 750, 925, 1100, 150, 150));
		plateau.add(new Gare(26, "GARE DE RABAT"));
		plateau.add(new Terrain(27, "BOULEVARD MOHAMED ZERKTOUNI", 260, 130, 22, 110, 330, 800, 975, 1150, 150, 150));
		plateau.add(new Terrain(28, "AVENUE MOHAMED VI", 260, 130, 22, 110, 330, 800, 975, 1150, 150, 150));
		plateau.add(new ServicePublic(29, "ONEP",150));
		plateau.add(new Terrain(30, "BOULEVARD ABDELLATIF BENKADDOUR", 280, 140, 24, 120, 360, 850, 1025, 1200, 150, 150));
		plateau.add(new Case(31, "ALLEZ EN PRISON"));
		plateau.add(new Terrain(32, "AVENUE HASSAN II", 300, 150, 26, 130, 390, 900, 1100, 1275, 200, 200));
		plateau.add(new Terrain(33, "CORNICHE DE CASABLANCA", 300, 150, 26, 130, 390, 900, 1100, 1275, 200, 200));
                plateau.add(new Carte(34,"CAISSE DE COMMUNAUTE",0,0));
		plateau.add(new Terrain(35, "AVE DR SIJELMASSI", 320, 160, 28, 150, 450, 1000, 1200, 1400, 200, 200));
		plateau.add(new Gare(36, "GARE DE CASA PORT"));
                plateau.add(new Carte(37,"CHANCE",0,0));
		plateau.add(new Terrain(38, "BLD MASSIRA AL KHADRA", 350, 175, 35, 175, 500, 1100, 1300, 1500, 200, 200));
		plateau.add(new Taxe(39, "TAXE DE LUXE", 100));
		plateau.add(new Terrain(40, "BOULEVARD D'ANFA", 400, 200, 50, 200, 600, 1400, 1700, 2000, 200, 200));
	


        carteChance.add(new Carte(100, "Votre imeuble et votre pr�t rapportent. vous devez toucher 150 M", 150, -1));
		carteChance.add(new Carte(100, "Amande pour ex�s de vitesse : payer 15 M", -15, -1));
		carteChance.add(new Carte(100, "La banque vous verse un dividende de 50 M", 50, -1));
		carteChance.add(new Carte(100, "Vous faites des reparations sur toutes vos propriet�s : Versez 25 M pour chaque maison et 100 M pour chaque Hotel que vous possedez.", -1, -1));
		carteChance.add(new Carte(100, "Vous etes �t� �lu president du conseil d'administration. Versez 50 M � chaque joueur.", -1, -1));

        System.out.println("Position = "+position);
        //
        if(position==11){
            jLabel1.setText("<html><center><b><div bgcolor='black'><font color='white'>Simple visite en prison</font></div></b></center></html>");
            jButton2.setVisible(false);
            if(VientApartirDuprison){
                this.setVisible(false);
            }
        }

        
        
        //
        if(position==21){
            jLabel1.setText("<html><center><b><div bgcolor='black'><font color='white'>Vous êtes en Park</font></div></b></center></html>");
            jButton2.setVisible(false);
        }

        if(position==8||position==23||position==37)
        {


        //v = (int)(Math.random() * (4-0)) + 0;
        jLabel1.setText("<html><center><b><div bgcolor='black'><font color='white'>Carte chance</font></div></b><br>"+carteChance.get(3).getDescription()+"</center></html>");

        //choix_joueurs.joueurs.get(id_joueur).modifierSolde((int)+(carteCaisee.get(v).getMontant()));

        Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
        Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
        jButton2.setVisible(false);
        }

         if(position==3||position==18||position==34)
        {


        jLabel1.setText("<html><center><b><div bgcolor='black'><font color='white'>Carte Caisse de Communaute</font></div></b><br>"+carteChance.get(3).getDescription()+"</center></html>");
        int id_joueur=0;
        if(Partie_Monopoly.RoleCourant==0){
            id_joueur=1;
        }

        Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
        Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
        jButton2.setVisible(false);
        }

        //
        if(position==31){
            jLabel1.setText("<html><center><b><div bgcolor='red'><font color='white'>Prison</font></div><br><br><br>Allez en prison.</b></center></html>");
            int id_joueur=0;
            if(Partie_Monopoly.RoleCourant==0){
                id_joueur=1;
            }
            //Ici
                choix_joueurs.joueurs.get(id_joueur).setPos(11);
                Partie_Monopoly.Sedeplacer(choix_joueurs.joueurs.get(id_joueur));
                VientApartirDuprison=true;
           //Fin ici
            jButton2.setVisible(false);
        }
        
        boolean deja_occupe=false;
        for(int i=0;i<CasesOccuppe.size();i++){
            if(CasesOccuppe.get(i)==position){
                deja_occupe=true;
                break;
            }
        }

if(position!=11 && position!=21 && position!=31 && position!=3 && position!=18 && position!=34 && position!=8 && position!=23 && position!=37){
         if(deja_occupe){
            int id_joueur=0;
            if(Partie_Monopoly.RoleCourant==0){
                id_joueur=1;
            }


            Case t=plateau.get(position);

            

            if((t.getClass()).toString().equals("class Terrain")){
                Terrain t1=(Terrain)t;
                if(id_joueur==1){
                    jLabel1.setText(choix_joueurs.joueurs.get(1).getNom()+"=== "+ t1.getLoyer0() +" M ===>"+choix_joueurs.joueurs.get(0).getNom());
                    choix_joueurs.joueurs.get(1).modifierSolde((int)(-t1.getLoyer0()));
                    choix_joueurs.joueurs.get(0).modifierSolde((int)(t1.getLoyer0()));
                    Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
                    Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
                 }
                 else{
                     jLabel1.setText(choix_joueurs.joueurs.get(0).getNom()+"=== "+ t1.getLoyer0() +" M ===>"+choix_joueurs.joueurs.get(1).getNom());
                     choix_joueurs.joueurs.get(0).modifierSolde((int)(-t1.getLoyer0()));
                     choix_joueurs.joueurs.get(1).modifierSolde((int)(t1.getLoyer0()));
                     Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
                     Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
                 }
          }
          
          ////////////////////////////
              if((t.getClass()).toString().equals("class Gare")){
                Gare g=(Gare)t;
                if(id_joueur==1){
                    jLabel1.setText(choix_joueurs.joueurs.get(1).getNom()+"=== "+ g.getLoyer1() +" M ===>"+choix_joueurs.joueurs.get(0).getNom());
                    choix_joueurs.joueurs.get(1).modifierSolde((int)(-g.getLoyer1()));
                    choix_joueurs.joueurs.get(0).modifierSolde((int)(g.getLoyer1()));
                    Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
                    Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
                 }
                 else{
                     jLabel1.setText(choix_joueurs.joueurs.get(0).getNom()+"=== "+ g.getLoyer1() +" M ===>"+choix_joueurs.joueurs.get(1).getNom());
                     choix_joueurs.joueurs.get(0).modifierSolde((int)(-g.getLoyer1()));
                     choix_joueurs.joueurs.get(1).modifierSolde((int)(g.getLoyer1()));
                     Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
                     Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
                 }
          }
         ////////////////////////////

            ////////////\\\\\\\\\\\\\\\

                if((t.getClass()).toString().equals("class ServicePublic")){
                //Somme des dés * 4
                    int val=Partie_Monopoly.val_somme_de*4;
                if(id_joueur==1){
                    jLabel1.setText(choix_joueurs.joueurs.get(1).getNom()+"=== "+ val +" M ===>"+choix_joueurs.joueurs.get(0).getNom());
                    choix_joueurs.joueurs.get(1).modifierSolde((int)(-val));
                    choix_joueurs.joueurs.get(0).modifierSolde((int)(val));
                    Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
                    Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
                 }
                 else{
                     jLabel1.setText(choix_joueurs.joueurs.get(0).getNom()+"=== "+ val +" M ===>"+choix_joueurs.joueurs.get(1).getNom());
                     choix_joueurs.joueurs.get(0).modifierSolde((int)(-val));
                     choix_joueurs.joueurs.get(1).modifierSolde((int)val);
                     Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
                     Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
                 }
          }

            ////////////\\\\\\\\\\\\\\\\\

        }
         else{
            jLabel1.setText(getInformation(position));
         }

        }//Fin position!=11 , 21 , 31

    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int id_joueur=0;
        if(Partie_Monopoly.RoleCourant==0){
            id_joueur=1;
        }
        
        CasesOccuppe.add(position);
        Proprietere.add(id_joueur);
        Noms.add(choix_joueurs.joueurs.get(id_joueur).getNom());
        for(int i=0;i<CasesOccuppe.size();i++){
            System.out.println("Case ocuupe n° : "+CasesOccuppe.get(i)+" Proprietaire : "+Proprietere.get(i)+" Nom : "+Noms.get(i));
        }

        Propriete t=(Propriete)(plateau.get(position));
        choix_joueurs.joueurs.get(id_joueur).modifierSolde((int)-(t.getPrixAchat()));
        choix_joueurs.joueurs.get(id_joueur).addProprietes(plateau.get(position));
        
        
        Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
        Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());

        Partie_Monopoly.AfficherProprietaire(position,id_joueur);

        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherCase().setVisible(true);
            }
        });
    }

    public void ModifierSolde(Joueur joueur,int Solde){
        joueur.setSolde(Solde);
    }

    public String getInformation(int id_case){

        



                if(id_case==1 || id_case==3 || id_case==5 || id_case==8 || id_case==11 || id_case==18 ||id_case==21 || id_case==23 || id_case==31 || id_case==34 || id_case==37 || id_case==39){
                        jButton2.setVisible(false);
                        int id_joueur=0;
                        if(Partie_Monopoly.RoleCourant==0){
                            id_joueur=1;
                        }
                        if(id_case==5){
                            choix_joueurs.joueurs.get(id_joueur).modifierSolde(-200);
                            Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
                            Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
                        }
                        if(id_case==39){
                            choix_joueurs.joueurs.get(id_joueur).modifierSolde(-100);
                            Partie_Monopoly.solde_joueur_1.setText(""+choix_joueurs.joueurs.get(0).getSolde());
                            Partie_Monopoly.solde_joueur_2.setText(""+choix_joueurs.joueurs.get(1).getSolde());
                        }
                }

                boolean occupe=false;
                for(int i=0;i<CasesOccuppe.size();i++){
                        if(id_case==CasesOccuppe.get(i)){
                            occupe=true;
                            break;
                        }
                }

                if(occupe){
                    jButton2.setEnabled(false);
                }

                carteChance.add(new Carte(100, "Votre imeuble et votre pr�t rapportent. vous devez toucher 150 M", 150, -1));
		carteChance.add(new Carte(100, "Amande pour ex�s de vitesse : payer 15 M", -15, -1));
		carteChance.add(new Carte(100, "La banque vous verse un dividende de 50 M", 50, -1));
		carteChance.add(new Carte(100, "Vous faites des reparations sur toutes vos propriet�s : Versez 25 M pour chaque maison et 100 M pour chaque Hotel que vous possedez.", -1, -1));
		carteChance.add(new Carte(100, "Vous etes �t� �lu president du conseil d'administration. Versez 50 M � chaque joueur.", -1, -1));

                carteCaisee.add(new Carte(200, "les impots vous remboursent 20 M", 20, -1));
		carteCaisee.add(new Carte(200, "Frais de scolarit�. Payer 50 M", -50, -1));
		carteCaisee.add(new Carte(200, "Votre assurance vie vous rapporte 100 M", 100, -1));
		carteCaisee.add(new Carte(200, "Votre placement vous rapporte. Recevez 100 M", 100, -1));
		carteCaisee.add(new Carte(200, "Commission d'expert immobilier. Recevez 25 M", 25, -1));
		carteCaisee.add(new Carte(200, "Vous h�ritez de 100 M", 100, -1));
		carteCaisee.add(new Carte(200, "Erreur de la banque en votre faveur. Recevez 200 M", 200, -1));
		carteCaisee.add(new Carte(200, "La vente de votre stock vous rapporte 50 M", 50, -1));
		carteCaisee.add(new Carte(200, "Visite chez le medecin : Payez 50 M", -50, -1));
		carteCaisee.add(new Carte(200, "Vous avez gagn� le deuxieme prix de beaut�. Recevez 10 M", 10, -1));
		carteCaisee.add(new Carte(200, "Frais d'hospitalisation. Payer 100 M", 100, -1));
		carteCaisee.add(new Carte(200, "c'est votre anniversaire : chaque joueur doit vous donner 10 M", -1, -1));
		carteCaisee.add(new Carte(200, "Vous faites des reparations sur toutes vos propriet�s : Versez 25 M pour chaque maison et 100 M pour chaque Hotel que vous possedez.", -1, -1));


                plateau.add(new Case());
		plateau.add(new Case(1,"DEPART"));
		plateau.add(new Terrain(2,"BOULEVARD MANSOUR EDDAHBI", 60, 30, 2, 10, 30, 90, 160, 250, 50, 50));
		plateau.add(new Case(3,"CAISSE DE COMMUNITE"));
		plateau.add(new Terrain(4,"AVENUE DES MERINIDES", 60, 30, 4, 20, 60, 180, 320, 450, 50, 50));
		plateau.add(new Taxe(5, "IMPOT SUR LE REVENU", 200));
		plateau.add(new Gare(6, "GARE DE MARRAKECH"));
		plateau.add(new Terrain(7, "BOULEVARD MOULAY YOUSSEF", 100, 50, 6, 30, 90, 270, 400, 550, 50, 50));
		plateau.add(new Carte(8,"CHANCE",0,0));
		plateau.add(new Terrain(9, "AVENUE DES ALMOHADES", 100, 50, 6, 30, 90, 270, 400, 550, 50, 50));
		plateau.add(new Terrain(10, "RUE ALLAL BENABDELLAH", 120, 60, 8, 40, 100, 300, 450, 600, 50, 50));
		plateau.add(new Case(11,"SIMPLE VISITE DE PRISON" ));
		plateau.add(new Terrain(12, "RUE MOKHTAR SOUSSI", 140, 70, 10, 50, 150, 450, 625, 750, 100, 100));
		plateau.add(new ServicePublic(13, "ONE",150));
		plateau.add(new Terrain(14, "BOULEVARD ABDELMOUMEN", 140, 70, 10, 50, 150, 450, 625, 750, 100, 100));
		plateau.add(new Terrain(15, "BOULEVARD YACOUB EL MANSOUR", 160, 80, 12, 60, 180, 500, 700, 900, 100, 100));
		plateau.add(new Gare(16, "GARE DE TANGER"));
		plateau.add(new Terrain(17, "BOULEVARD ABDELKRIM ALKHATTABI", 180, 90, 14, 70, 200, 550, 750, 950, 100, 100));
                plateau.add(new Carte(18,"CAISSE DE COMMUNAUTE",0,0));
		plateau.add(new Terrain(19, "BOULEVARD BRAHIM ROUDANI", 180, 90, 14, 70, 200, 550, 750, 950, 100, 100));
		plateau.add(new Terrain(20, "AVENUE DES FORCES ARMEES ROYALES", 200, 100, 16, 80, 220, 600, 800, 1000, 100, 100));
                plateau.add(new Case(21,"PARK"));
		plateau.add(new Terrain(22, "AVENUE MOHAMED V", 220, 110, 18, 90, 250, 700, 875, 1050, 150, 150));
                plateau.add(new Carte(23,"CHANCE",0,0));
		plateau.add(new Terrain(24, "BOULEVARD ABDERRAHIM BOUABID", 220, 110, 18, 90, 250, 700, 875, 1050, 150, 150));
		plateau.add(new Terrain(25, "ROND POINT DES SPORTS", 240, 120, 20, 100, 300, 750, 925, 1100, 150, 150));
		plateau.add(new Gare(26, "GARE DE RABAT"));
		plateau.add(new Terrain(27, "BOULEVARD MOHAMED ZERKTOUNI", 260, 130, 22, 110, 330, 800, 975, 1150, 150, 150));
		plateau.add(new Terrain(28, "AVENUE MOHAMED VI", 260, 130, 22, 110, 330, 800, 975, 1150, 150, 150));
		plateau.add(new ServicePublic(29, "ONEP",150));
		plateau.add(new Terrain(30, "BOULEVARD ABDELLATIF BENKADDOUR", 280, 140, 24, 120, 360, 850, 1025, 1200, 150, 150));
		plateau.add(new Case(31, "ALLEZ EN PRISON"));
		plateau.add(new Terrain(32, "AVENUE HASSAN II", 300, 150, 26, 130, 390, 900, 1100, 1275, 200, 200));
		plateau.add(new Terrain(33, "CORNICHE DE CASABLANCA", 300, 150, 26, 130, 390, 900, 1100, 1275, 200, 200));
                plateau.add(new Carte(34,"CAISSE DE COMMUNAUTE",0,0));
		plateau.add(new Terrain(35, "AVE DR SIJELMASSI", 320, 160, 28, 150, 450, 1000, 1200, 1400, 200, 200));
		plateau.add(new Gare(36, "GARE DE CASA PORT"));
                plateau.add(new Carte(37,"CHANCE",0,0));
		plateau.add(new Terrain(38, "BLD MASSIRA AL KHADRA", 350, 175, 35, 175, 500, 1100, 1300, 1500, 200, 200));
		plateau.add(new Taxe(39, "TAXE DE LUXE", 100));
		plateau.add(new Terrain(40, "BOULEVARD D'ANFA", 400, 200, 50, 200, 600, 1400, 1700, 2000, 200, 200));
	


               return plateau.get(id_case).toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
