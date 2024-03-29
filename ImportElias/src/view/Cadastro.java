/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.CadastroTableModel;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import Model.Cad;

/**
 *
 * @author rober
 */
public class Cadastro extends javax.swing.JFrame {
    CadastroTableModel tabelmodel = new CadastroTableModel();
    String pathFile = "dadosCadastro.txt";
    String pathFileTemp = "dbTemp.txt";
    String readFile = "";
    
    List<Cad> listRekamMedis = new ArrayList<>();
    private final TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelmodel);
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonMostrarDados = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonImportar = new javax.swing.JButton();
        jLabelCadastro = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelAgendaPainel = new javax.swing.JLabel();
        jLabelFundoAgenda = new javax.swing.JLabel();
        jLabelNome1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Email", "Estado", "Cidade", "End"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 740, 270));

        jButtonMostrarDados.setBackground(new java.awt.Color(255, 0, 0));
        jButtonMostrarDados.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonMostrarDados.setText("Mostrar Dados");
        jButtonMostrarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMostrarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 310, 50));

        jButtonLimpar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonLimpar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonLimpar.setText("Limpar\n");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 310, 50));

        jButtonImportar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonImportar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonImportar.setText("Agendar");
        jButtonImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 310, 50));

        jLabelCadastro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastro.setText("Cadastro e Agendamento");
        getContentPane().add(jLabelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Acre \t AC", " Alagoas \t AL", " Amapá \t AP", " Amazonas \t AM", " Bahia \t BA", " Ceará \t CE", " Distrito Federal \t DF", " Espírito Santo \t ES", " Goiás \t GO", " Maranhão \t MA", " Mato Grosso \t MT", " Mato Grosso do Sul \t MS", " Minas Gerais \t MG", " Pará \t PA", " Paraíba  \t PB", " Paraná \t PR", " Pernambuco \t PE", " Piauí \t PI", " Rio de Janeiro \t RJ", " Rio Grande do Norte \t RN", " Rio Grande do Sul  \t RS", " Rondônia \t RO", " Roraima \t RR", " Santa Catarina  \t SC", " São Paulo  \t SP", " Sergipe \t SE", " Tocantins\tTO" }));
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 200, -1));

        jLabelEstado.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstado.setText("Estado do Usuário");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 30));

        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abaiara", "Abílio Martins (Ipu)", "Acarape", "Acaraú", "Acopiara", "Açude dos Pinheiros (Ibicuitinga)", "Açudinho (Tamboril)", "Açudinho dos Costas (Mombaça)", "Adrianópolis (Granja)", "Água Fria (Quixeré)", "Água Verde (Guaiúba)", "Aguaí (Itapajé)", "Águas Belas (Boa Viagem)", "Aiuá (Massapê)", "Aiuaba", "Alagoinha (Araripe)", "Alagoinha (Paraipaba)", "Alazans (Ipueiras)", "Alcântaras", "Algodões (Quiterianópolis)", "Almofala (Itarema)", "Altaneira", "Alto Lindo (Ibiapina)", "Alto Santo", "Amanaiara (Reriutaba)", "Amanari (Maranguape)", "Amaniutuba (Lavras da Mangabeira)", "Amarelas (Camocim)", "Amaro (Assaré)", "América (Ipueiras)", "Amontada", "Anauá (Mauriti)", "Anil (Meruoca)", "Aningás (Horizonte)", "Anjinhos (Santana do Cariri)", "Antonina do Norte", "Antônio Diogo (Redenção)", "Antônio Marques (Maranguape)", "Aprazível (Sobral)", "Apuiarés", "Aquinópolis (Jaguaribe)", "Aquiraz", "Araçás (Paracuru)", "Aracati", "Aracatiaçu (Sobral)", "Aracatiara (Amontada)", "Aracoiaba", "Arajara (Barbalha)", "Aranaú (Acaraú)", "Arapá (Tianguá)", "Arapari (Itapipoca)", "Araporanga (Santana do Cariri)", "Araquém (Coreaú)", "Ararendá", "Araripe", "Arariús (Cariré)", "Aratama (Assaré)", "Araticum (Ubajara)", "Aratuba", "Areial (Santa Quitéria)", "Areré (Barreira)", "Ariscos dos Marianos (Ocara)", "Arneiroz", "Aroeiras (Coreaú)", "Arrojado (Lavras da Mangabeira)", "Aruaru (Morada Nova)", "Assaré", "Assis (Crateús)", "Assunção (Itapipoca)", "Assunção (Solonópole)", "Aurora", "Aurora (Deputado Irapuan Pinheiro)", "Baixa Grande (Itapajé)", "Baixio", "Baixio (Deputado Irapuan Pinheiro)", "Baixio da Donana (Jucás)", "Baixio das Palmeiras (Crato)", "Baleia (Itapipoca)", "Balseiros (Ipueiras)", "Banabuiú", "Bandeira (Itatira)", "Baracho (Sobral)", "Barão de Aquiraz (Campos Sales)", "Barbada (Choró)", "Barbalha", "Barra (Aiuaba)", "Barra (Fortim)", "Barra (Iguatu)", "Barra do Ingá (Acopiara)", "Barra do Sotero (Croatá)", "Barra Nova (Redenção)", "Barra Nova (Tauá)", "Barreira", "Barreira dos Vianas (Aracati)", "Barreiras (Iguatu)", "Barreiros (Monsenhor Tabosa)", "Barreiros (Potengi)", "Barreiros (São Benedito)", "Barrento (Itapipoca)", "Barrinha (Saboeiro)", "Barro", "Barro Alto (Iguatu)", "Barroquinha", "Bastiões (Iracema)", "Baturité", "Baú (Guaiúba)", "Baú (Iguatu)", "Beberibe", "Bela Cruz", "Bela Vista (Crato)", "Bela Vista (Itapipoca)", "Belém (Quixeramobim)", "Belmonte (Crato)", "Betânia (Croatá)", "Betânia (Hidrolândia)", "Betânia (Ibiapina)", "Betânia (Solonópole)", "Bilheira (Sobral)", "Bitupitá (Barroquinha)", "Bixopa (Limoeiro do Norte)", "Boa Água (Morada Nova)", "Boa Esperança (Moraújo)", "Boa Esperança (Tamboril)", "Boa Viagem", "Boa Vista (Baturité)", "Boa Vista (Mombaça)", "Boa Vista (Paraipaba)", "Boa Vista do Caxitoré (Irauçuba)", "Bom Princípio (Caucaia)", "Bonfim (Senador Pompeu)", "Bonfim (Sobral)", "Bonhu (Russas)", "Bonito (Canindé)", "Boqueirão (Boa Viagem)", "Borges (Jaguaruana)", "Brejinho (Araripe)", "Brejo Grande (Santana do Cariri)", "Brejo Santo", "Brotas (Miraíma)", "Buritizal (Poranga)", "Buritizinho (Mauriti)", "Cabreiro (Aracati)", "Cachoeira (Itatira)", "Cachoeira (Maranguape)", "Cachoeira de Fora (Arneiroz)", "Cachoeira Grande (Poranga)", "Cacimba Nova (Madalena)", "Cacimbas (Cariré)", "Caiçara (Canindé)", "Caiçara (Cruz)", "Caiçarinha (Choró)", "Caio Prado (Itapiúna)", "Caioca (Sobral)", "Caipu (Cariús)", "Cajazeiras (Madalena)", "Cajueiro (Barreira)", "Calabaça (Várzea Alegre)", "Caldas (Barbalha)", "Caldeirão (Salitre)", "Califórnia (Quixadá)", "Camará (Aquiraz)", "Camboas (Paraipaba)", "Camilos (Meruoca)", "Camocim", "Campanário (Uruoca)", "Campestre (Chorozinho)", "Campestre (Fortim)", "Campo Alegre (Crato)", "Campos (Canindé)", "Campos Belos (Caridade)", "Campos Sales", "Canaan (Trairi)", "Canafistula (Apuiarés)", "Canafistula (Jucás)", "Canaúna (Ipaumirim)", "Cangati (Mombaça)", "Cangati (Solonópole)", "Canindé", "Canindezinho (Ibicuitinga)", "Canindezinho (Nova Russas)", "Canindezinho (Potiretama)", "Canindezinho (Várzea Alegre)", "Canta Galo (Acarape)", "Capim de Roça (Pindoretama)", "Capistrano", "Capitão Mor (Pedra Branca)", "Capitão Pedro Sampaio (Canindé)", "Caponga (Cascavel)", "Caponga da Bernarda (Aquiraz)", "Caponguinha (Pindoretama)", "Caracará (Sobral)", "Caridade", "Cariré", "Caririaçu", "Cariús", "Cariutaba (Farias Brito)", "Carmelópolis (Campos Sales)", "Carnaúba (Jati)", "Carnaubal", "Carnaúbas (Mombaça)", "Carnaubinha (Milhã)", "Carquejo (Mucambo)", "Carrapateiras (Tauá)", "Caruataí (Tianguá)", "Carvalho (Tamboril)", "Carvoeiro (Itarema)", "Cascavel", "Castanhão (Alto Santo)", "Catarina", "Catolé (Mombaça)", "Catolé da Pista (Piquet Carneiro)", "Catuana (Caucaia)", "Catunda", "Caucaia", "Caxitoré (Tejuçuoca)", "Caxitoré (Umirim)", "Cedro", "Cedro (Chorozinho)", "Cemoaba (Tururu)", "Chaval", "Chile (Ibicuitinga)", "Choró", "Chorozinho", "Cipó (Mombaça)", "Cipó dos Anjos (Quixadá)", "Cococi (Parambu)", "Codiá (Senador Pompeu)", "Coité (Irauçuba)", "Coité (Mauriti)", "Colina (Pacoti)", "Conceição (Hidrolândia)", "Conceição (Tururu)", "Coreaú", "Córrego (Barreira)", "Córrego dos Fernandes (Aracati)", "Corrente (Jardim)", "Crateús", "Crato", "Crioulos (Pereiro)", "Cristais (Cascavel)", "Croatá", "Croatá (São Gonçalo do Amarante)", "Croatá (Varjota)", "Cruxati (Itapipoca)", "Cruz", "Cruz (Itapajé)", "Cruz de Pedra (Iguatu)", "Cruzeirinho (Icó)", "Cuncas (Barro)", "Curatis (Tamboril)", "Curral Velho (Crateús)", "Curupira (Ocara)", "Custódio (Quixadá)", "Damião Carneiro (Quixeramobim)", "Daniel de Queirós (Quixadá)", "Delmiro Gouveia (Pires Ferreira)", "Deputado Irapuan Pinheiro", "Deserto (Itapipoca)", "Dom Leme (Santana do Cariri)", "Dom Maurício (Quixadá)", "Dom Quintino (Crato)", "Domingos da Costa (Boa Viagem)", "Donato (Pires Ferreira)", "Dourado (Guaiúba)", "Dourado (Horizonte)", "Ebron (Acopiara)", "Ema (Iracema)", "Ema (Pindoretama)", "Ematuba (Independência)", "Encantado (Quixeramobim)", "Engenheiro João Tomé (Ipueiras)", "Engenheiro José Lopes (Senador Pompeu)", "Engenho Velho (Barro)", "Ererê", "Espacinha (Nova Russas)", "Esperança (Canindé)", "Estrela (Barbalha)", "Eusébio", "Faísca (Redenção)", "Farias Brito", "Fátima (Pacoti)", "Faveira (Carnaubal)", "Feiticeiro (Jaguaribe)", "Feitosa (Caririaçu)", "Felipe (Saboeiro)", "Felizardo (Ipaumirim)", "Flamengo (Saboeiro)", "Flores (Ipu)", "Flores (Russas)", "Forquilha", "Forquilha (Beberibe)", "Fortaleza", "Fortim", "Frecheirinha", "Gadelha (Iguatu)", "Gado (Palmácia)", "Gado dos Rodrigues (Palmácia)", "Gameleira de São Sebastião (Missão Velha)", "Garças (Amontada)", "Gavião (Parambu)", "Gázea (Ipueiras)", "General Sampaio", "General Tibúrcio (Viçosa do Ceará)", "Gereraú (Itaitinga)", "Giqui (Jaguaruana)", "Girau (Aracati)", "Graça", "Grande Basílio (Palmácia)", "Granja", "Granjeiro", "Groairas", "Guaiúba", "Guajiru (Fortim)", "Guanacés (Cascavel)", "Guaraciaba do Norte", "Guaramiranga", "Guararu (Caucaia)", "Guassi (Redenção)", "Guassussê (Orós)", "Guia (Boa Viagem)", "Guriú (Camocim)", "Hidrolândia", "Holanda (Tamboril)", "Horizonte", "Iapi (Independência)", "Iara (Barro)", "Ibaretama", "Ibiapaba (Crateús)", "Ibiapina", "Ibicatu (Várzea Alegre)", "Ibicuã (Piquet Carneiro)", "Ibicuitaba (Icapuí)", "Ibicuitinga", "Iborepi (Lavras da Mangabeira)", "Ibuaçu (Boa Viagem)", "Ibuguaçu (Granja)", "Icapuí", "Icaraí (Amontada)", "Icó", "Icozinho (Icó)", "Ideal (Aracoiaba)", "Igaroi (Orós)", "Iguaçu (Canindé)", "Iguatu", "Independência", "Ingazeiras (Aurora)", "Ingazeiras (Ipu)", "Inhamuns (Tauá)", "Inhuçu (São Benedito)", "Ipaguaçú (Massapê)", "Ipaporanga", "Ipaumirim", "Ipiranga (Boa Viagem)", "Ipu", "Ipueiras", "Ipueiras dos Gomes (Canindé)", "Iracema", "Irajá (Hidrolândia)", "Irapuã (Crateús)", "Iratinga (Itapajé)", "Irauçuba", "Isidoro (Acopiara)", "Itacima (Guaiúba)", "Itacolomy (Uruburetama)", "Itaguá (Campos Sales)", "Itaiçaba", "Itaipaba (Pacajus)", "Itaitinga", "Itamaracá (Groairas)", "Itans (Itapiúna)", "Itapajé", "Itapebussu (Maranguape)", "Itapeim (Beberibe)", "Itapipoca", "Itapiúna", "Itapó (Pacatuba)", "Itarema", "Itatira", "Jaburuna (Ubajara)", "Jacampari (Boa Viagem)", "Jacarecoara (Cascavel)", "Jacaúna (Aquiraz)", "Jaguarão (Aracoiaba)", "Jaguaretama", "Jaguaribara", "Jaguaribe", "Jaguaruana", "Jaibaras (Sobral)", "Jamacaru (Missão Velha)", "Jandrangoeira (Independência)", "Jardim", "Jardim (Paracuru)", "Jardimirim (Jardim)", "Jati", "Jenipapeiro (Aracoiaba)", "Jijoca de Jericoacoara", "João Cordeiro (Santana do Acaraú)", "Jordão (Sobral)", "José de Alencar (Iguatu)", "Juá (Irauçuba)", "Juá (Penaforte)", "Juá (Quixadá)", "Juatama (Quixadá)", "Juazeiro de Baixo (Morada Nova)", "Juazeiro do Norte", "Jubaia (Maranguape)", "Jucá (Cariré)", "Jucás", "Juritianha (Acaraú)", "Justiniano Serpa (Aquiraz)", "Lacerda (Quixeramobim)", "Ladeira Grande (Maranguape)", "Lages (Maranguape)", "Lagoa da Cruz (Croatá)", "Lagoa das Pedras (Crateús)", "Lagoa de São João (Aracoiaba)", "Lagoa do Barro (Barreira)", "Lagoa do Carneiro (Acaraú)", "Lagoa do Juvenal (Maranguape)", "Lagoa do Mato (Itatira)", "Lagoa dos Crioulos (Salitre)", "Lagoa Grande (Amontada)", "Lagoa Grande (Barreira)", "Lagoa Grande (Morada Nova)", "Lagoa Grande (Russas)", "Lagoinha (Quixeré)", "Lambedouro (Viçosa do Ceará)", "Lapa (Graça)", "Laranjeiras (Banabuiú)", "Lavras da Mangabeira", "Lima Campos (Icó)", "Limoeiro do Norte", "Lisieux (Santa Quitéria)", "Livramento (Ipueiras)", "Logradouro (Santa Quitéria)", "Macambira (Poranga)", "Macaóca (Madalena)", "Macaraú (Santa Quitéria)", "Maceió (Fortim)", "Madalena", "Major Simplício (Nova Russas)", "Majorlândia (Aracati)", "Malhada (Saboeiro)", "Malhada Grande (Santa Quitéria)", "Mangabeira (Lavras da Mangabeira)", "Manibu (Icapuí)", "Manituba (Quixeramobim)", "Manoel Correia (Mombaça)", "Manoel Guedes (Maranguape)", "Mapuá (Jaguaribe)", "Maracanaú", "Maranguape", "Maratoã (Deputado Irapuan Pinheiro)", "Maravilha (Choró)", "Marco", "Marinheiros (Itapipoca)", "Marrecas (Tauá)", "Marrocos (Juazeiro do Norte)", "Marruás (Tauá)", "Martinópole", "Martinslândia (Guaraciaba do Norte)", "Massapê", "Mata Fresca (Aracati)", "Matias (Pentecoste)", "Matriz (Ipueiras)", "Mauriti", "Mel (Jucás)", "Meruoca", "Miguel Xavier (Caririaçu)", "Milagres", "Milhã", "Milton Belo (Aracoiaba)", "Mineirolândia (Pedra Branca)", "Miragem (Caririaçu)", "Miraíma", "Mirambé (Caucaia)", "Miranda (Parambu)", "Missão Nova (Missão Velha)", "Missão Velha", "Missi (Irauçuba)", "Mocambo (Guaraciaba do Norte)", "Mocambo (Marco)", "Moitas (Amontada)", "Mombaça", "Monsenhor Tabosa", "Monte Alegre (Barro)", "Monte Alegre (Canindé)", "Monte Alverne (Crato)", "Monte Castelo (Campos Sales)", "Monte Castelo (Choró)", "Monte Grave (Milhã)", "Monte Sion (Parambu)", "Montenebo (Crateús)", "Morada Nova", "Moraújo", "Morrinhos", "Morrinhos Novos (Guaraciaba do Norte)", "Morro Branco (Itatira)", "Mosquito (Amontada)", "Mucambo", "Mulungu", "Mulungu (Piquet Carneiro)", "Mumbaba (Massapê)", "Mundau (Trairi)", "Mundaú (Uruburetama)", "Munguba (Trairi)", "Muribeca (Santa Quitéria)", "Mutambeiras (Santana do Acaraú)", "Naraniu (Várzea Alegre)", "Nascente (Amontada)", "Nenenlândia (Quixeramobim)", "Nossa Senhora do Livramento (Monsenhor Tabosa)", "Nova Betânia (Farias Brito)", "Nova Betânia (Nova Russas)", "Nova Fátima (Ipueiras)", "Nova Floresta (Jaguaribe)", "Nova Olinda", "Nova Russas", "Nova Santa Cruz (Mauriti)", "Nova Veneza (Ubajara)", "Nova Vida (Ibaretama)", "Novo Assis (Parambu)", "Novo Horizonte (Ocara)", "Novo Oriente", "Núcleo Colonial Pio XII (Guaiúba)", "Ocara", "Oiticica (Crateús)", "Oiticica (Ibaretama)", "Oiticica (Parambu)", "Olho DÁgua (Mauriti)", "Olho Dágua do Bezerril (Boa Viagem)", "Olho-DÁgua da Bica (Tabuleiro do Norte)", "Oliveiras (Tamboril)", "Orós", "Pacajus", "Pacatuba", "Pacoti", "Pacujá", "Padre Cícero (Juazeiro do Norte)", "Padre Linhares (Massapê)", "Padre Vieira (Viçosa do Ceará)", "Pai João (Aratuba)", "Pajeú (Araripe)", "Palestina (Mauriti)", "Palestina (Novo Oriente)", "Palestina (Orós)", "Palestina do Norte (Meruoca)", "Palhano", "Palmácia", "Palmatória (Itapiúna)", "Panacuí (Marco)", "Papara (Maranguape)", "Paracuá (Uruoca)", "Paracuru", "Paraipaba", "Paraiso (Catunda)", "Parajuru (Beberibe)", "Parambu", "Paramoti", "Parapuí (Santana do Acaraú)", "Parazinho (Granja)", "Paripueira (Beberibe)", "Pascoal (Pacajus)", "Passagem (Chaval)", "Passagem (Quixeramobim)", "Passagem Funda (Aracoiaba)", "Pasta (Solonópole)", "Patacas (Aquiraz)", "Patos (Sobral)", "Patos dos Liberatos (Chorozinho)", "Patriarca (Sobral)", "Paus Branco (Madalena)", "Paus Brancos (Quixeramobim)", "Pecém (São Gonçalo do Amarante)", "Pedra Branca", "Pedra Branca (Aracoiaba)", "Pedra de Fogo (Sobral)", "Pedra e Cal (Ibaretama)", "Pedras (Morada Nova)", "Pedras Brancas (Banabuiú)", "Pedrinhas (Icó)", "Peixe (Russas)", "Peixe Gordo (Tabuleiro do Norte)", "Penaforte", "Penedo (Maranguape)", "Pentecoste", "Pereiro", "Pernambuquinho (Guaramiranga)", "Pessoa Anta (Granja)", "Pindoguaba (Tianguá)", "Pindoretama", "Pio X (Umari)", "Piquet Carneiro", "Pirangi (Ibaretama)", "Pires Ferreira", "Pitombeira (Itapajé)", "Pitombeiras (Cascavel)", "Plácido Martins (Aracoiaba)", "Planalto (Arneiroz)", "Poço (Brejo Santo)", "Poço Comprido (Amontada)", "Poço Comprido (Jaguaribara)", "Poço da Onça (Miraíma)", "Poço Doce (Paracuru)", "Poço Grande (Jucás)", "Poço Verde (Mucambo)", "Ponta da Serra (Crato)", "Poranga", "Porfirio Sampaio (Pentecoste)", "Porteiras", "Potengi", "Poti (Crateús)", "Potiretama", "Prata (Bela Cruz)", "Pratiús (Pindoretama)", "Prefeita Suely Pinheiro (Solonópole)", "Prudente de Morais (Quixeramobim)", "Quatiguaba (Viçosa do Ceará)", "Queimados (Horizonte)", "Quimami (Missão Velha)", "Quincoé (Acopiara)", "Quincuncá (Farias Brito)", "Quitaiús (Lavras da Mangabeira)", "Quiterianópolis", "Quixadá", "Quixariú (Campos Sales)", "Quixelô", "Quixeramobim", "Quixeré", "Rafael Arruda (Sobral)", "Raimundo Martins (Santa Quitéria)", "Ramadinha (Ararendá)", "Realejo (Crateús)", "Redenção", "Repartição (Croatá)", "Reriutaba", "Retiro (Uruburetama)", "Riachão (Miraíma)", "Riacho Grande (Araripe)", "Riacho Verde (Quixadá)", "Riacho Verde (Várzea Alegre)", "Riacho Vermelho (Iguatu)", "Rinaré (Banabuiú)", "Roldão (Morada Nova)", "Rosário (Milagres)", "Russas", "Sabiaguaba (Amontada)", "Saboeiro", "Sacramento (Ipaporanga)", "Salão (Senador Sá)", "Salgado dos Machados (Sobral)", "Salgado dos Mendes (Forquilha)", "Salitre", "Salitre (Canindé)", "Sambaíba (Granja)", "Santa Ana (Pacoti)", "Santa Cruz do Banabuiú (Pedra Branca)", "Santa Fé (Acaraú)", "Santa Fé (Crato)", "Santa Felícia (Acopiara)", "Santa Luzia (Jaguaruana)", "Santa Luzia (Uruburetama)", "Santa Quitéria", "Santa Rita (Choró)", "Santa Tereza (Aracati)", "Santa Tereza (Croatá)", "Santa Tereza (Tauá)", "Santana (Crateús)", "Santana do Acaraú", "Santana do Cariri", "Santarém (Orós)", "Santo André (Penaforte)", "Santo Antônio (Acopiara)", "Santo Antônio (Ararendá)", "Santo Antônio (Barro)", "Santo Antônio (Crateús)", "Santo Antônio da Pindoba (Ibiapina)", "Santo Antônio dos Fernandes (Meruoca)", "São Bartolomeu (Cariús)", "São Benedito", "São Bernardo (Quixadá)", "São Domingos (Caridade)", "São Felipe (Brejo Santo)", "São Felix (Mauriti)", "São Francisco (Meruoca)", "São Francisco (Quiterianópolis)", "São Gonçalo do Amarante", "São Gonçalo do Umari (Mombaça)", "São João (Ererê)", "São João de Deus (Russas)", "São João do Amanari (Maranguape)", "São João do Jaguaribe", "São João dos Queiroz (Quixadá)", "São Joaquim (Umirim)", "São Joaquim do Salgado (Senador Pompeu)", "São José (Abaiara)", "São José (Ipueiras)", "São José (Iracema)", "São José (Palhano)", "São José (Saboeiro)", "São José das Lontras (Ipueiras)", "São José de Solonópole (Solonópole)", "São José do Lagamar (Jaguaruana)", "São José do Torto (Sobral)", "São Luís do Curu", "São Miguel (Mauriti)", "São Miguel (Quixeramobim)", "São Paulinho (Acopiara)", "São Pedro (Paracuru)", "São Pedro do Gavião (Tururu)", "São Pedro do Norte (Jucás)", "São Pedro do Norte (Nova Russas)", "São Raimundo (Novo Oriente)", "São Romão (Altaneira)", "São Roque (Croatá)", "São Sebastião (Baturité)", "São Sebastião (Cariús)", "São Tomé (Itapajé)", "São Vicente (Icó)", "São Vicente (Mombaça)", "Sapo (Santana do Acaraú)", "Sapupara (Maranguape)", "Saquinho (Jaguaruana)", "Sebastião de Abreu (Pentecoste)", "Senador Pompeu", "Senador Sá", "Sereno de Cima (Ocara)", "Serra do Félix (Beberibe)", "Serragem (Ocara)", "Serrota (Barro)", "Serrota (Senador Sá)", "Serrote (Iguatu)", "Serrote (São Gonçalo do Amarante)", "Serrote do Meio (Itapajé)", "Simão (Porteiras)", "Sitiá (Banabuiú)", "Sítios Novos (Caucaia)", "Siupê (São Gonçalo do Amarante)", "Sobral", "Soledade (Itapajé)", "Solidão (Acopiara)", "Solonópole", "Suassurana (Iguatu)", "Sucatinga (Beberibe)", "Sucesso (Tamboril)", "Sussuanha (Guaraciaba do Norte)", "Tabainha (Tianguá)", "Taboleiro (Antonina do Norte)", "Tabuleiro do Norte", "Taíba (São Gonçalo do Amarante)", "Tamboril", "Tangente (Massapê)", "Tanques (Maranguape)", "Tapera (Aquiraz)", "Taperuaba (Sobral)", "Tapuiara (Quixadá)", "Tapuio (Cariré)", "Targinos (Canindé)", "Tarrafas", "Taua", "Tejuçuoca", "Tianguá", "Timbaúba dos Marinheiros (Chorozinho)", "Timonha (Granja)", "Tipi (Aurora)", "Tomé (Quixeré)", "Trairi", "Trapiá (Forquilha)", "Trapiá (Santa Quitéria)", "Trapiá (Sobral)", "Triângulo (Chorozinho)", "Trici (Tauá)", "Triunfo (Nova Olinda)", "Tróia (Pedra Branca)", "Trussu (Acopiara)", "Tucunduba (Caucaia)", "Tucuns (Crateús)", "Tuína (Massapê)", "Tururu", "Ubajara", "Ubaúna (Coreaú)", "Ubiraçu (Canindé)", "Uiraponga (Morada Nova)", "Umari", "Umarituba (São Gonçalo do Amarante)", "Umarizeiras (Maranguape)", "Umburanas (Mauriti)", "Umirim", "União (Madalena)", "Uruburetama", "Uruoca", "Uruquê (Quixeramobim)", "Varjota", "Várzea (Cedro)", "Várzea Alegre", "Várzea da Onça (Quixadá)", "Várzea da Volta (Moraújo)", "Várzea do Gilo (Ipu)", "Várzea dos Espinhos (Guaraciaba do Norte)", "Vazantes (Aracoiaba)", "Vazente do Curú (Canindé)", "Velame (Deputado Irapuan Pinheiro)", "Ventura (Alcântaras)", "Vertentes do Lagedo (Maranguape)", "Viçosa (Fortim)", "Viçosa (Ibicuitinga)", "Viçosa do Ceará", "Video (Catunda)", "Vila Soares (Apuiarés)", "Vista Alegre (Croatá)", " ", " " }));
        getContentPane().add(jComboBoxCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabelCidade.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCidade.setText("Cidade do Usuário");
        getContentPane().add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 30));

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 190, -1));

        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 250, -1));

        jLabelEndereco.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço");
        getContentPane().add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 30));

        jLabelEmail.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 30));
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));

        jLabelNome.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome do Usuário");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 30));

        jLabelAgendaPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabelAgendaPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1030, 680));

        jLabelFundoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/FundoAgenda.png"))); // NOI18N
        getContentPane().add(jLabelFundoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 830));

        jLabelNome1.setText("jLabel1");
        getContentPane().add(jLabelNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 160, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jButtonImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportarActionPerformed
        colocarDados();
        try {
            salvarDados();
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonImportarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparDados();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonMostrarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarDadosActionPerformed
        mostrarDados();
    }//GEN-LAST:event_jButtonMostrarDadosActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImportar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMostrarDados;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabelAgendaPainel;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFundoAgenda;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    public void colocarDados(){
       DefaultTableModel dtmCadastros; 
       dtmCadastros = (DefaultTableModel) jTable1.getModel();
       
       Object[] dados = {jTextFieldNome.getText(),
              jTextFieldEmail.getText(),
              jComboBoxEstado.getSelectedItem().toString(),
              jComboBoxCidade.getSelectedItem().toString(),
              jTextFieldEndereco.getText().toString(),};
              
       
            dtmCadastros.addRow(dados);
           
   }
    private void salvarDados() throws FileNotFoundException, IOException{
        
        
        String save = jTextFieldNome.getText() + ";" + jTextFieldEmail.getText() + ";" + jComboBoxEstado.getSelectedItem() + ";" + jComboBoxCidade.getSelectedItem() + ";" + jTextFieldEndereco.getText();
            OutputStream os = new FileOutputStream("dados.txt");
            Writer wr = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(new FileWriter(pathFile,true));
            
            br.write(save);
            br.newLine();
            br.close();
            dialog("Dados Salvos");
        }

   private void dialog(String text){
        JOptionPane.showMessageDialog(rootPane, text);
   }
    public void limparDados(){
    
          jTextFieldNome.setText("");
          jTextFieldEmail.setText("");
          jComboBoxEstado.setSelectedItem("");
          jComboBoxCidade.setSelectedItem("");
          jTextFieldEndereco.setText("");
    }
 private void mostrarDados() {
        try {
            listRekamMedis.clear();
            String readLine;
            File file = new File(pathFile);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufReader;
            try (FileReader reader = new FileReader(file)) {
                bufReader = new BufferedReader(reader);
                while ((readLine = bufReader.readLine()) != null) {
                    if (readLine.equals("")) {
                        continue;
                    }
                    String[] splitData = readLine.split(";");
                    Cad cd = new Cad();
                    cd.setNome(splitData[0]);
                    cd.setEmail(splitData[1]);
                    cd.setEstado(splitData[2]);
                    cd.setCidade(splitData[3]);
                    cd.setEnd(readLine);
                    
                    listRekamMedis.add(cd);
                }
                tabelmodel.setList(listRekamMedis);
                jTable1.setModel(tabelmodel);
            }
            bufReader.close();
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}

   
