/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saudefx;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

/**
 * FXML Controller class
 *
 * @author Pedro Marinho (pedro.marinho238@gmail.com)
 */
public class TelaPrincipalController implements Initializable {

    @FXML
    private JFXTextField NomeField;

    @FXML
    private JFXTextField IdadeField;

    @FXML
    private JFXTextField PesoField;

    @FXML
    private JFXTextField AlturaField;

    @FXML
    private JFXTextField QuadrilField;

    @FXML
    private JFXTextField AbdominaisField;

    @FXML
    private JFXTextField FlexaoField;

    @FXML
    private JFXComboBox<String> SexoCom;

    @FXML
    private JFXComboBox<String> NAFSCom;

    @FXML
    private JFXCheckBox PAJCheck;

    @FXML
    private JFXCheckBox IMCCheck;

    @FXML
    private JFXCheckBox IACCheck;

    @FXML
    private JFXCheckBox PICheck;

    @FXML
    private JFXCheckBox PI2Check;

    @FXML
    private JFXCheckBox PNCheck;

    @FXML
    private JFXCheckBox TACheck;

    @FXML
    private JFXCheckBox TFBCheck;

    @FXML
    private JFXCheckBox TMBCheck;

    @FXML
    private JFXCheckBox APCheck;

    @FXML
    private JFXButton OK;

    @FXML
    private Tab PAJTab;

    @FXML
    private Label RESULT_PAJ;

    @FXML
    private Label CAL_PAJ;

    @FXML
    private Tab IMCTab;

    @FXML
    private Label RESULT_IMC;

    @FXML
    private Label CAL_IMC;

    @FXML
    private Tab IACTab;

    @FXML
    private Label RESULT_IAC;

    @FXML
    private Label CAL_IAC;

    @FXML
    private Tab PITab;

    @FXML
    private Label RESULT_PI;

    @FXML
    private Label CAL_PI;

    @FXML
    private Tab PI2Tab;

    @FXML
    private Label RESULT_PI2;

    @FXML
    private Label CAL_PI2;

    @FXML
    private Tab PNTab;

    @FXML
    private Label RESULT_PN;

    @FXML
    private Label CAL_PN;

    @FXML
    private Tab TATab;

    @FXML
    private Label RESULT_TA;

    @FXML
    private Label CAL_TA;

    @FXML
    private Tab TFBTab;

    @FXML
    private Label RESULT_TFB;

    @FXML
    private Label CAL_TFB;

    @FXML
    private Tab TMBTab;

    @FXML
    private Label RESULT_TBM;

    @FXML
    private Label CAL_TBM;

    @FXML
    private Tab APTab;

    @FXML
    private Label RESULT_AP;

    @FXML
    private Label CAL_AP;

    private boolean verificador() {
        boolean result = true;
        if (NomeField.getText() == null || NomeField.getText().length() == 0) {
            NomeField.setStyle("-fx-border-color:red");
            result = false;
        }
        if (IdadeField.getText() == null || IdadeField.getText().length() == 0) {
            IdadeField.setStyle("-fx-border-color:red");
            result = false;
        } else {
            try {
                Integer.valueOf(IdadeField.getText());
            } catch (NumberFormatException ex) {
                IdadeField.setStyle("-fx-border-color:red");
                result = false;
            }
        }
        if (AlturaField.getText() == null || AlturaField.getText().length() == 0) {
            AlturaField.setStyle("-fx-border-color:red");
            result = false;
        } else {
            try {
                Integer.valueOf(AlturaField.getText());
            } catch (NumberFormatException ex) {
                AlturaField.setStyle("-fx-border-color:red");
                result = false;
            }
        }
        if (PesoField.getText() == null || PesoField.getText().length() == 0) {
            PesoField.setStyle("-fx-border-color:red");
            result = false;
        } else {
            try {
                Float.valueOf(PesoField.getText());
            } catch (NumberFormatException ex) {
                PesoField.setStyle("-fx-border-color:red");
                result = false;
            }
        }
        if (QuadrilField.getText() == null || QuadrilField.getText().length() == 0) {
            QuadrilField.setStyle("-fx-border-color:red");
            result = false;
        } else {
            try {
                Float.valueOf(QuadrilField.getText());
            } catch (NumberFormatException ex) {
                QuadrilField.setStyle("-fx-border-color:red");
                result = false;
            }
        }
        if (AbdominaisField.getText() == null || AbdominaisField.getText().length() == 0) {
            AbdominaisField.setStyle("-fx-border-color:red");
            result = false;
        } else {
            try {
                Integer.valueOf(AbdominaisField.getText());
            } catch (NumberFormatException ex) {
                AbdominaisField.setStyle("-fx-border-color:red");
                result = false;
            }
        }
        if (FlexaoField.getText() == null || FlexaoField.getText().length() == 0) {
            FlexaoField.setStyle("-fx-border-color:red");
            result = false;
        } else {
            try {
                Integer.valueOf(FlexaoField.getText());
            } catch (NumberFormatException ex) {
                FlexaoField.setStyle("-fx-border-color:red");
                result = false;
            }
        }
        if (SexoCom.getValue() == null || SexoCom.getValue().length() == 0) {
            SexoCom.setStyle("-fx-border-color:red");
            result = false;
        }
        if (NAFSCom.getValue() == null || NAFSCom.getValue().length() == 0) {
            NAFSCom.setStyle("-fx-border-color:red");
            result = false;
        }

        return result;
    }

    @FXML
    void OK(ActionEvent event) {
        NomeField.setStyle("");
        IdadeField.setStyle("");
        AlturaField.setStyle("");
        PesoField.setStyle("");
        QuadrilField.setStyle("");
        AbdominaisField.setStyle("");
        FlexaoField.setStyle("");
        SexoCom.setStyle("");
        NAFSCom.setStyle("");
        if (verificador()) {
            nome = NomeField.getText();

            idade = Integer.valueOf(IdadeField.getText());
            altura = Float.valueOf(AlturaField.getText());
            peso = Float.valueOf(PesoField.getText());
            quadril = Float.valueOf(QuadrilField.getText());
            nam = Integer.valueOf(AbdominaisField.getText());
            nfm = Integer.valueOf(FlexaoField.getText());
            altura_metro = altura / 100;
            System.out.println(altura_metro);

            sexo = SexoCom.getValue();
            if (SexoCom.getValue().equals("Homem")) {
                sexo_n = 1;
            } else if (SexoCom.getValue().equals("Mulher")) {
                sexo_n = 2;
            }
            nafs = NAFSCom.getValue();
            switch (NAFSCom.getValue()) {
                case "INTENSA":
                    H_NAF = (float) 2.10;
                    M_NAF = (float) 1.82;
                    NIVEL = 3;
                    break;
                case "MODERADA":
                    H_NAF = (float) 1.78;
                    M_NAF = (float) 1.64;
                    NIVEL = 2;
                    break;
                case "LEVE":
                    H_NAF = (float) 1.55;
                    M_NAF = (float) 1.56;
                    NIVEL = 1;
                    break;
                default:
                    break;
            }

            if (IMCCheck.isSelected()) {
                IMCTab.setDisable(false);
                RESULT_IMC.setText(imc_resultado(idade, peso, (int) sexo_n, altura_metro)[2]);
                IMC = imc_resultado(idade, peso, (int) sexo_n, altura_metro)[0];
                IMC_S = imc_resultado(idade, peso, (int) sexo_n, altura_metro)[1];
            } else {
                IMCTab.setDisable(true);
            }
            if (APCheck.isSelected()) {
                APTab.setDisable(false);
                RESULT_AP.setText(AP_resultado(idade, peso, (int) sexo_n, altura_metro)[2]);
                AP = AP_resultado(idade, peso, (int) sexo_n, altura_metro)[1];
            } else {
                APTab.setDisable(true);
            }
            if (PICheck.isSelected()) {
                PITab.setDisable(false);
                RESULT_PI.setText(peso_ideal((int) sexo_n, altura_metro)[2]);
                PI = peso_ideal((int) sexo_n, altura_metro)[0];
            } else {
                PITab.setDisable(true);
            }
            if (PNCheck.isSelected()) {
                PNTab.setDisable(false);
                RESULT_PN.setText(peso_normal(altura)[2]);
                PN = peso_normal(altura)[0];
            } else {
                PNTab.setDisable(true);
            }
            if (TACheck.isSelected()) {
                TATab.setDisable(false);
                RESULT_TA.setText(teste_de_abdominal(idade, nam, (int) sexo_n)[2]);
                TA = teste_de_abdominal(idade, nam, (int) sexo_n)[1];
            } else {
                TATab.setDisable(true);
            }
            if (TFBCheck.isSelected()) {
                TFBTab.setDisable(false);
                RESULT_TFB.setText(teste_de_flexao_de_braco(idade, nfm, (int) sexo_n)[2]);
                TFB = teste_de_flexao_de_braco(idade, nfm, (int) sexo_n)[1];
            } else {
                TFBTab.setDisable(true);
            }
            if (IACCheck.isSelected()) {
                IACTab.setDisable(false);
                RESULT_IAC.setText(cal_iac(quadril, altura_metro, (int) sexo_n)[2]);
                IAC = cal_iac(quadril, altura_metro, (int) sexo_n)[1];
                IAC_S = cal_iac(quadril, altura_metro, (int) sexo_n)[2];
            } else {
                IACTab.setDisable(true);
            }
            if (TMBCheck.isSelected()) {
                TMBTab.setDisable(false);
                RESULT_TBM.setText(tmb(sexo_n, peso, altura, idade)[2]);
                TMB = tmb(sexo_n, peso, altura, idade)[0];
            } else {
                TMBTab.setDisable(true);
            }
            if (PAJCheck.isSelected()) {
                PAJTab.setDisable(false);
                RESULT_PAJ.setText(APj_resultado(idade, peso, (int) sexo_n, altura_metro)[1]);
                PAJ = APj_resultado(idade, peso, (int) sexo_n, altura_metro)[0];
            } else {
                PAJTab.setDisable(true);
            }
            if (PI2Check.isSelected()) {
                PI2Tab.setDisable(false);
                RESULT_PI2.setText(PI((int) sexo_n, altura_metro, idade)[2]);
                PI2 = PI((int) sexo_n, altura_metro, idade)[0];
            } else {
                PI2Tab.setDisable(true);
            }

           System.out.println("PI2 OK");
        }
    }
    private String nome, sexo, IMC_S, nafs, IAC_S, PAJ, IMC, IAC, PI, PI2, PN, TA, TFB, TMB, AP;
    private int idade, NIVEL, nam, nfm;
    private float H_NAF, M_NAF, sexo_n, peso, altura_metro, quadril, altura;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        SexoCom.getItems().add("Homem");
        SexoCom.getItems().add("Mulher");

        NAFSCom.getItems().add("INTENSA");
        NAFSCom.getItems().add("MODERADA");
        NAFSCom.getItems().add("LEVE");


        IMCTab.setDisable(true);
        APTab.setDisable(true);
        PITab.setDisable(true);
        PNTab.setDisable(true);
        IMCTab.setDisable(true);
        TFBTab.setDisable(true);
        IACTab.setDisable(true);
        TMBTab.setDisable(true);
        PAJTab.setDisable(true);
        PI2Tab.setDisable(true);
        TATab.setDisable(true);

    }

    @FXML
    private String[] teste_de_abdominal(float idade, float numero_de_abdominal_por_minuto, int sexo) {
        String[] result = new String[4];
        final String FRACO = "Esta fraco";
        final String AB_MEDIA = "esta abaixo da média";
        final String MEDIA = "esta na média";
        final String AC_MEDIA = "esta acima da média";
        final String EXECELETE = "esta execelente";

        switch (sexo) {

            case 1:
                if (idade >= 15 && idade <= 19) {
                    if (numero_de_abdominal_por_minuto <= 32) {
                        result[1] = FRACO;
                    }

                    if (numero_de_abdominal_por_minuto >= 33 && numero_de_abdominal_por_minuto <= 37) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 38 && numero_de_abdominal_por_minuto <= 41) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 42 && numero_de_abdominal_por_minuto <= 47) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 48) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 20 && idade <= 29) {
                    if (numero_de_abdominal_por_minuto <= 28) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 29 && numero_de_abdominal_por_minuto <= 32) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 33 && numero_de_abdominal_por_minuto <= 36) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 37 && numero_de_abdominal_por_minuto <= 42) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 43) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 30 && idade <= 39) {
                    if (numero_de_abdominal_por_minuto <= 21) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 22 && numero_de_abdominal_por_minuto <= 26) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 27 && numero_de_abdominal_por_minuto <= 30) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 31 && numero_de_abdominal_por_minuto <= 35) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 36) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 40 && idade <= 49) {
                    if (numero_de_abdominal_por_minuto <= 16) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 17 && numero_de_abdominal_por_minuto <= 21) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 22 && numero_de_abdominal_por_minuto <= 25) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 26 && numero_de_abdominal_por_minuto <= 30) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 31) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 50 && idade <= 59) {
                    if (numero_de_abdominal_por_minuto <= 12) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 13 && numero_de_abdominal_por_minuto <= 17) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 18 && numero_de_abdominal_por_minuto <= 21) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 22 && numero_de_abdominal_por_minuto <= 25) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 26) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 60 && idade <= 69) {
                    if (numero_de_abdominal_por_minuto <= 6) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 7 && numero_de_abdominal_por_minuto <= 11) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 12 && numero_de_abdominal_por_minuto <= 16) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 17 && numero_de_abdominal_por_minuto <= 22) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 23) {
                        result[1] = EXECELETE;
                    }
                }
                break;
            case 2:
                if (idade >= 15 && idade <= 19) {
                    if (numero_de_abdominal_por_minuto <= 26) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 27 && numero_de_abdominal_por_minuto <= 31) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 32 && numero_de_abdominal_por_minuto <= 35) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 36 && numero_de_abdominal_por_minuto <= 41) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 42) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 20 && idade <= 29) {
                    if (numero_de_abdominal_por_minuto <= 20) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 21 && numero_de_abdominal_por_minuto <= 24) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 25 && numero_de_abdominal_por_minuto <= 30) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 31 && numero_de_abdominal_por_minuto <= 35) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 36) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 30 && idade <= 39) {
                    if (numero_de_abdominal_por_minuto <= 14) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 15 && numero_de_abdominal_por_minuto <= 19) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 20 && numero_de_abdominal_por_minuto <= 23) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 24 && numero_de_abdominal_por_minuto <= 28) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 29) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 40 && idade <= 49) {
                    if (numero_de_abdominal_por_minuto <= 6) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 7 && numero_de_abdominal_por_minuto <= 14) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 15 && numero_de_abdominal_por_minuto <= 19) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 20 && numero_de_abdominal_por_minuto <= 24) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 25) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 50 && idade <= 59) {
                    if (numero_de_abdominal_por_minuto <= 2) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 3 && numero_de_abdominal_por_minuto <= 4) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 5 && numero_de_abdominal_por_minuto <= 11) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 12 && numero_de_abdominal_por_minuto <= 18) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 19) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 60 && idade <= 69) {
                    if (numero_de_abdominal_por_minuto <= 1) {
                        result[1] = FRACO;
                    }
                    if (numero_de_abdominal_por_minuto >= 3 && numero_de_abdominal_por_minuto <= 4) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 5 && numero_de_abdominal_por_minuto <= 11) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 12 && numero_de_abdominal_por_minuto <= 18) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_abdominal_por_minuto >= 19) {
                        result[1] = EXECELETE;
                    }
                }
                break;

        }
        result[2] = "Abdominais por minuto: " + result[1];

        return result;
    }

    @FXML
    private String[] teste_de_flexao_de_braco(float idade, float numero_de_flexao_por_minuto, int sexo) {

        String[] result = new String[4];
        final String FRACO = "Fraco";
        final String AB_MEDIA = "Abaixo da Média";
        final String MEDIA = " Na Média";
        final String AC_MEDIA = "Acima da Média";
        final String EXECELETE = "Execelente";

        switch (sexo) {
            case 1:
                if (idade >= 15 && idade <= 19) {
                    if (numero_de_flexao_por_minuto <= 17) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 18 && numero_de_flexao_por_minuto <= 22) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 23 && numero_de_flexao_por_minuto <= 28) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 29 && numero_de_flexao_por_minuto <= 38) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 39) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 20 && idade <= 29) {
                    if (numero_de_flexao_por_minuto <= 16) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 17 && numero_de_flexao_por_minuto <= 21) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 22 && numero_de_flexao_por_minuto <= 28) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 29 && numero_de_flexao_por_minuto <= 35) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 36) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 30 && idade <= 39) {
                    if (numero_de_flexao_por_minuto <= 11) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 12 && numero_de_flexao_por_minuto <= 16) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 17 && numero_de_flexao_por_minuto <= 21) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 22 && numero_de_flexao_por_minuto <= 29) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 30) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 40 && idade <= 49) {
                    if (numero_de_flexao_por_minuto <= 9) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 10 && numero_de_flexao_por_minuto <= 12) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 13 && numero_de_flexao_por_minuto <= 16) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 17 && numero_de_flexao_por_minuto <= 21) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 22) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 50 && idade <= 59) {
                    if (numero_de_flexao_por_minuto <= 6) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 7 && numero_de_flexao_por_minuto <= 9) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 10 && numero_de_flexao_por_minuto <= 12) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 13 && numero_de_flexao_por_minuto <= 20) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 21) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 60 && idade <= 69) {
                    if (numero_de_flexao_por_minuto <= 4) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 5 && numero_de_flexao_por_minuto <= 7) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 8 && numero_de_flexao_por_minuto <= 10) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 11 && numero_de_flexao_por_minuto <= 17) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 18) {
                        result[1] = EXECELETE;
                    }
                }
                break;
            case 2:
                if (idade >= 15 && idade <= 19) {
                    if (numero_de_flexao_por_minuto <= 11) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 12 && numero_de_flexao_por_minuto <= 17) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 18 && numero_de_flexao_por_minuto <= 24) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 25 && numero_de_flexao_por_minuto <= 32) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 33) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 20 && idade <= 29) {
                    if (numero_de_flexao_por_minuto <= 9) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 10 && numero_de_flexao_por_minuto <= 14) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 15 && numero_de_flexao_por_minuto <= 20) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 21 && numero_de_flexao_por_minuto <= 29) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 30) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 30 && idade <= 39) {
                    if (numero_de_flexao_por_minuto <= 7) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 8 && numero_de_flexao_por_minuto <= 12) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 13 && numero_de_flexao_por_minuto <= 19) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 20 && numero_de_flexao_por_minuto <= 26) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 27) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 40 && idade <= 49) {
                    if (numero_de_flexao_por_minuto <= 4) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 5 && numero_de_flexao_por_minuto <= 10) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 11 && numero_de_flexao_por_minuto <= 14) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 15 && numero_de_flexao_por_minuto <= 23) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 24) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 50 && idade <= 59) {
                    if (numero_de_flexao_por_minuto <= 1) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 2 && numero_de_flexao_por_minuto <= 6) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 7 && numero_de_flexao_por_minuto <= 10) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 11 && numero_de_flexao_por_minuto <= 22) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 21) {
                        result[1] = EXECELETE;
                    }
                }
                if (idade >= 60 && idade <= 69) {
                    if (numero_de_flexao_por_minuto <= 1) {
                        result[1] = FRACO;
                    }
                    if (numero_de_flexao_por_minuto >= 2 && numero_de_flexao_por_minuto <= 4) {
                        result[1] = AB_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 5 && numero_de_flexao_por_minuto <= 11) {
                        result[1] = MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 12 && numero_de_flexao_por_minuto <= 16) {
                        result[1] = AC_MEDIA;
                    }
                    if (numero_de_flexao_por_minuto >= 17);
                    result[1] = EXECELETE;
                }
                break;
        }
        result[2] = "Flexão por minuto esta " + result[1];
        return result;
    }

    @FXML
    private String[] cal_iac(float quadril, float altura_metro, int sexo_n) {
        String[] result = new String[4];
        float iac;
        float altura_raiz;
        altura_raiz = (float) Math.sqrt(altura_metro);
        iac = quadril / (altura_metro * altura_raiz);
        iac = iac - 18;
        result[3] = ("[" + quadril + " (cm) / (" + altura_metro + " (m) x √" + altura_metro + " (m))] – 18=" + String.format("%.0f", iac));
        CAL_IAC.setText(result[3]);
        final String AB_PESO = "Abaixo do peso";
        final String PESO_N = "Peso normal";
        final String AC_PESO = "Acima do peso";
        final String OBESIDADE = "Obesidade";

        switch (sexo_n) {
            case 1:
                if (iac < 8) {
                    result[1] = AB_PESO;
                }
                if (iac >= 8 && iac < 21) {
                    result[1] = PESO_N;
                }
                if (iac >= 21 && iac <= 25) {
                    result[1] = AC_PESO;
                }
                if (iac > 25) {
                    result[1] = OBESIDADE;
                }
                break;
            case 2:
                if (iac < 21) {
                    result[1] = AB_PESO;
                }
                if (iac >= 21 && iac < 33) {
                    result[1] = PESO_N;
                }
                if (iac >= 33 && iac <= 38) {
                    result[1] = AC_PESO;
                }
                if (iac > 38) {
                    result[1] = OBESIDADE;
                }
                break;

        }
        result[2] = ("(IAC): Situação: " + result[1] + "\n" + "(IAC) O seu indice de gordura é de : " + String.format("%.0f", iac));
        result[0] = String.valueOf(iac);
        return result;
    }

    @FXML
    private String[] imc_resultado(float idade, float peso, int sexo_n, float altura_metro) {
        String[] result = new String[4];
        float imc;
        imc = peso / (altura_metro * altura_metro);
        result[3] = ("[" + peso + " (Kg) / (" + altura_metro + " (m) x " + altura_metro + " (m)]=" + String.format("%.1f", imc));
        CAL_IMC.setText(result[3]);
        final String MAB_PESO = "Muito abaixo do peso";
        final String AB_PESO = "Abaixo do peso";
        final String PESO_N = "Peso normal ";
        final String AC_PESO = "Acima do peso ";
        final String OBESIDADE1 = "Obesidade I";
        final String OBESIDADE2 = "Obesidade II (severa)";
        final String OBESIDADE3 = "Obesidade III (morbida)";

        if (idade < 65) {
            if (imc < 17) {
                result[1] = MAB_PESO;
            }
            if (imc >= 17 && imc <= 18.49) {
                result[1] = AB_PESO;
            }
            if (imc >= 18.50 && imc <= 24.99) {
                result[1] = PESO_N;
            }
            if (imc >= 25 && imc <= 29.99) {
                result[1] = AC_PESO;
            }
            if (imc >= 30 && imc <= 34.99) {
                result[1] = OBESIDADE1;
            }
            if (imc >= 35 && imc <= 39.99) {
                result[1] = OBESIDADE2;
            }
            if (imc >= 40) {
                result[1] = OBESIDADE3;
            }
        }
        if (idade >= 65 && sexo_n == 1) {
            if (imc < 21.9) {
                result[1] = AB_PESO;
            }
            if (imc >= 22 & imc <= 27) {
                result[1] = PESO_N;
            }
            if (imc >= 27.1 & imc <= 30) {
                result[1] = AC_PESO;
            }
            if (imc >= 30.1 & imc <= 35) {
                result[1] = OBESIDADE1;
            }
            if (imc >= 35.1 && imc <= 39.9) {
                result[1] = OBESIDADE2;
            }
            if (imc >= 40) {
                result[1] = OBESIDADE3;
            }
        }
        if (idade >= 65 && sexo_n == 2) {
            if (imc < 21.9) {
                result[1] = AB_PESO;
            }
            if (imc >= 22 && imc <= 27) {
                result[1] = PESO_N;
            }
            if (imc >= 27.1 && imc <= 32) {
                result[1] = AC_PESO;
            }
            if (imc >= 32.1 && imc <= 37) {
                result[1] = OBESIDADE1;
            }
            if (imc >= 37.1 && imc <= 41.9) {
                result[1] = OBESIDADE2;
            }
            if (imc >= 42) {
                result[1] = OBESIDADE3;
            }
        }
        result[2] = ("(IMC) " + result[1] + "\n" + "IMC= " + String.format("%.1f", imc));
        result[0] = String.format("%.1f", imc);
        return result;
    }

    @FXML
    private String[] AP_resultado(float IDADE, float peso, int sexo_n, float altura_metro) {

        String[] result = new String[4];
        final String GAB_PESO = "Desnutrição grave";
        final String MAB_PESO = "Desnutrição moderada";
        final String AB_PESO = "Desnutrição leve";
        final String PESO_N = "Eutrofia (dentro do peso ideal) ";
        final String AC_PESO = "Sobrepeso ";
        final String OBESIDADE1 = "Obesidade";
        float pesoideal = 0;
        float imc = 0;

        switch (sexo_n) {
            case 1:
                if (IDADE < 65) {
                    imc = 22;
                }
                if (IDADE >= 65 && IDADE <= 69) {
                    imc = (float) 24.3;
                }
                if (IDADE >= 70 && IDADE <= 74) {
                    imc = (float) 25.1;
                }
                if (IDADE >= 75 && IDADE <= 79) {
                    imc = (float) 23.9;
                }
                if (IDADE >= 80 && IDADE <= 84) {
                    imc = (float) 23.7;
                }

                if (IDADE >= 85) {
                    imc = (float) 23.1;
                }
                pesoideal = imc * (altura_metro * altura_metro);
                break;
            case 2:
                if (IDADE < 65) {
                    imc = 21;
                }
                if (IDADE >= 65 && IDADE <= 69) {
                    imc = (float) 26.5;
                }
                if (IDADE >= 70 && IDADE <= 74) {
                    imc = (float) 26.3;
                }
                if (IDADE >= 75 && IDADE <= 79) {
                    imc = (float) 26.1;
                }
                if (IDADE >= 80 && IDADE <= 84) {
                    imc = (float) 25.5;
                }

                if (IDADE >= 85) {
                    imc = (float) 23.6;
                }
                pesoideal = imc * (altura_metro * altura_metro);
                ;
                break;
        }

        float AP1 = peso / pesoideal * 100;
        result[3] = (peso + "(Kg)/" + String.format("%.1f", pesoideal) + "(PI)*100=" + String.format("%.1f", AP1) + "%");
        CAL_AP.setText(result[3]);
        if (AP1 < 70) {
            result[1] = GAB_PESO;
        }
        if (AP1 >= 70.1 && imc <= 80) {
            result[1] = MAB_PESO;
        }
        if (AP1 >= 80.1 && imc <= 90) {
            result[1] = AB_PESO;
        }
        if (AP1 >= 90.1 && imc <= 110) {
            result[1] = PESO_N;
        }
        if (AP1 >= 110.1 && imc <= 120) {
            result[1] = AC_PESO;
        }
        if (AP1 > 120) {
            result[1] = OBESIDADE1;
        }
        result[2] = ("(AP) Você esta " + result[1] + "\n" + "AP= " + String.format("%.1f", AP1) + "%");
        result[0] = (String.format("%.1f", AP1) + "%");
        return result;
    }

    @FXML
    private String[] APj_resultado(float IDADE, float peso, int sexo_n, float altura_metro) {
        String[] result = new String[4];
        float pesoideal = 0;
        float imc = 0;

        switch (sexo_n) {
            case 1:
                if (IDADE < 65) {
                    imc = 22;
                }
                if (IDADE >= 65 && IDADE <= 69) {
                    imc = (float) 24.3;
                }
                if (IDADE >= 70 && IDADE <= 74) {
                    imc = (float) 25.1;
                }
                if (IDADE >= 75 && IDADE <= 79) {
                    imc = (float) 23.9;
                }
                if (IDADE >= 80 && IDADE <= 84) {
                    imc = (float) 23.7;
                }

                if (IDADE >= 85) {
                    imc = (float) 23.1;
                }
                pesoideal = imc * (altura_metro * altura_metro);
                break;
            case 2:
                if (IDADE < 65) {
                    imc = 21;
                }
                if (IDADE >= 65 && IDADE <= 69) {
                    imc = (float) 26.5;
                }
                if (IDADE >= 70 && IDADE <= 74) {
                    imc = (float) 26.3;
                }
                if (IDADE >= 75 && IDADE <= 79) {
                    imc = (float) 26.1;
                }
                if (IDADE >= 80 && IDADE <= 84) {
                    imc = (float) 25.5;
                }

                if (IDADE >= 85) {
                    imc = (float) 23.6;
                }
                pesoideal = imc * (altura_metro * altura_metro);
                ;
                break;
        }

        float PAJ = (float) ((pesoideal - peso) * 0.25 + peso);
        result[3] = (String.format("%.1f", pesoideal) + "-" + peso + ")(PI)*0,25=" + String.format("%.1f", PAJ) + "Kg");
        CAL_PAJ.setText(result[3]);
        result[1] = ("PAJ= " + String.format("%.1f", PAJ) + "Kg");
        result[0] = String.format("%.1f", PAJ) + "Kg";
        return result;
    }

    @FXML
    private String[] peso_ideal(int sexo_n, float altura_metro) {
        String[] result = new String[4];
        float pesoideal = 0;
        switch (sexo_n) {
            case 1:
                pesoideal = (float) ((72.7 * altura_metro) - 58);
                result[3] = ("[(72.7 * " + altura_metro + " (m)) - 58]=" + String.format("%.1f", pesoideal) + "Kg");
                CAL_PI.setText(result[3]);
                System.out.println("pi" + result[3]);
                break;
            case 2:
                pesoideal = (float) ((62.1 * altura_metro) - 44.7);
                result[3] = ("[(62.1 * " + altura_metro + " (m)) - 44.7]=" + String.format("%.1f", pesoideal) + "Kg");
                CAL_PI.setText(result[3]);
                break;
        }
        result[2] = ("(Pesso ideal) O seu peso ideal é: " + String.format("%.1f", pesoideal) + "Kg");
        result[0] = (String.format("%.1f", pesoideal) + "Kg");
        return result;
    }

    @FXML
    private String[] PI(int sexo_n, float altura_metro, float IDADE) {
        String[] result = new String[4];
        float pesoideal = 0;
        float imc = 0;

        switch (sexo_n) {
            case 1:
                if (IDADE < 65) {
                    imc = 22;
                }
                if (IDADE >= 65 && IDADE <= 69) {
                    imc = (float) 24.3;
                }
                if (IDADE >= 70 && IDADE <= 74) {
                    imc = (float) 25.1;
                }
                if (IDADE >= 75 && IDADE <= 79) {
                    imc = (float) 23.9;
                }
                if (IDADE >= 80 && IDADE <= 84) {
                    imc = (float) 23.7;
                }

                if (IDADE >= 85) {
                    imc = (float) 23.1;
                }
                pesoideal = imc * (altura_metro * altura_metro);
                result[3] = (imc + "(IMC)* (" + altura_metro + "(m)* " + altura_metro + "(m))=" + String.format("%.1f", pesoideal) + "Kg");
                CAL_PI2.setText(result[3]);
                break;
            case 2:
                if (IDADE < 65) {
                    imc = 21;
                }
                if (IDADE >= 65 && IDADE <= 69) {
                    imc = (float) 26.5;
                }
                if (IDADE >= 70 && IDADE <= 74) {
                    imc = (float) 26.3;
                }
                if (IDADE >= 75 && IDADE <= 79) {
                    imc = (float) 26.1;
                }
                if (IDADE >= 80 && IDADE <= 84) {
                    imc = (float) 25.5;
                }

                if (IDADE >= 85) {
                    imc = (float) 23.6;
                }
                pesoideal = imc * (altura_metro * altura_metro);

                result[3] = (imc + "(IMC)* (" + altura_metro + "(m)* " + altura_metro + "(m)=" + String.format("%.1f", pesoideal) + "Kg");
                CAL_PI2.setText(result[3]);
                break;
        }
        result[2] = ("(Pesso ideal) O seu peso ideal é: " + String.format("%.1f", pesoideal) + "Kg");
        result[0] = (String.format("%.1f", pesoideal) + "Kg");
        return result;
    }

    @FXML
    private String[] peso_normal(float altura) {
        String[] result = new String[4];
        float pesonormal;
        pesonormal = (altura - 100);
        result[0] = pesonormal + "Kg";
        result[3] = ("[" + altura + "(cm)- 100]=" + String.format("%.1f", pesonormal) + "Kg");
        CAL_PN.setText(result[3]);
        result[2] = "(Peso Normal) o seu peso normal é: " + String.format("%.1f", pesonormal) + "Kg";
        return result;
    }

    @FXML
    private String[] tmb(float sexo_n, float peso, float altura, float idade) {

        String[] result = new String[4];
        float tmb = 0;
        if (sexo_n == 2) {
//            
            tmb = (float) (peso * 9.6 + altura * 1.8 - idade * 4.7);// calculo taxa metabolica basal para mulheres
            tmb = tmb * M_NAF;

            result[3] = ("[(" + peso + "(Kg)*9.6+" + altura + "(cm)*1.8-" + idade + "(Id)*4.7)*" + M_NAF + "]=" + String.format("%.0f", tmb));
            CAL_TBM.setText(result[3]);
        } else if (sexo_n == 1) {
            tmb = (float) (66.5 + peso * 14 + altura * 5 - idade * 6.7);// calculo taxa metabolica basal para homens
            tmb = tmb * H_NAF;

            result[3] = ("[(66.5+" + peso + "(Kg)*14+" + altura + "(cm)*5-" + idade + "(Id)*6.7)*" + H_NAF + "]=" + String.format("%.0f", tmb));
            CAL_TBM.setText(result[3]);
        }
        result[2] = "(TMB)\n"
                + "A quantidade minima de energia(calorias)\n "
                + "necessaria para manter as fuções vitais \n"
                + "do organismo em reupouso é de " + String.format("%.0f", tmb) + " kcal";

        result[0] = String.format("%.0f", tmb) + "kcal";

        return result;
    }

}
