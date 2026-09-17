package gui;

import entities.Attributes;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.TextInputControl;

public class MainViewController extends Attributes {
  // * FXML correspondence of each element

  @FXML
  TextField stSet;

  @FXML
  TextField dxSet;

  @FXML
  TextField iqSet;

  @FXML
  TextField htSet;

  @FXML
  TextField hpSet;

  @FXML
  TextField willSet;

  @FXML
  TextField perSet;

  @FXML
  TextField fpSet;

  @FXML
  TextField bSpeedSet;

  @FXML
  TextField bMoveSet;

  @FXML
  TextField tfAd00;

  @FXML
  TextField tfAd01;

  @FXML
  TextField tfAd02;

  @FXML
  TextField tfAd03;

  @FXML
  TextField tfAd04;

  @FXML
  TextField tfAd05;

  @FXML
  TextField tfAd06;

  @FXML
  TextField tfAd07;

  @FXML
  TextField tfAd08;

  @FXML
  TextField tfAd09;

  @FXML
  TextField tfAd10;

  @FXML
  TextField tfAd11;

  @FXML
  TextField tfAdCost00;

  @FXML
  TextField tfAdCost01;

  @FXML
  TextField tfAdCost02;

  @FXML
  TextField tfAdCost03;

  @FXML
  TextField tfAdCost04;

  @FXML
  TextField tfAdCost05;

  @FXML
  TextField tfAdCost06;

  @FXML
  TextField tfAdCost07;

  @FXML
  TextField tfAdCost08;

  @FXML
  TextField tfAdCost09;

  @FXML
  TextField tfAdCost10;

  @FXML
  TextField tfAdCost11;

  @FXML
  TextField tfDi00;

  @FXML
  TextField tfDi01;

  @FXML
  TextField tfDi02;

  @FXML
  TextField tfDi03;

  @FXML
  TextField tfDi04;

  @FXML
  TextField tfDi05;

  @FXML
  TextField tfDi06;

  @FXML
  TextField tfDi07;

  @FXML
  TextField tfDi08;

  @FXML
  TextField tfDi09;

  @FXML
  TextField tfDi10;

  @FXML
  TextField tfDi11;

  @FXML
  TextField tfDiCost00;

  @FXML
  TextField tfDiCost01;

  @FXML
  TextField tfDiCost02;

  @FXML
  TextField tfDiCost03;

  @FXML
  TextField tfDiCost04;

  @FXML
  TextField tfDiCost05;

  @FXML
  TextField tfDiCost06;

  @FXML
  TextField tfDiCost07;

  @FXML
  TextField tfDiCost08;

  @FXML
  TextField tfDiCost09;

  @FXML
  TextField tfDiCost10;

  @FXML
  TextField tfDiCost11;

  @FXML
  TextField tfLang00;

  @FXML
  TextField tfLang01;

  @FXML
  TextField tfLang02;

  @FXML
  TextField tfLang03;

  @FXML
  TextField tfCult00;

  @FXML
  TextField tfCult01;

  @FXML
  TextField tfCult02;

  @FXML
  TextField tfCult03;

  @FXML
  TextField tfTl;

  @FXML
  TextField tfName;

  @FXML
  TextField tfPlayer;

  @FXML
  TextField tfHeight;

  @FXML
  TextField tfWeight;

  @FXML
  TextField tfSizeModifier;

  @FXML
  TextField tfAge;

  @FXML
  TextField tfAppearance;

  @FXML
  TextField tfSkill00;

  @FXML
  TextField tfSkill01;

  @FXML
  TextField tfSkill02;

  @FXML
  TextField tfSkill03;

  @FXML
  TextField tfSkill04;

  @FXML
  TextField tfSkill05;

  @FXML
  TextField tfSkill06;

  @FXML
  TextField tfSkill07;

  @FXML
  TextField tfSkill08;

  @FXML
  TextField tfSkill09;

  @FXML
  TextField tfSkill10;

  @FXML
  TextField tfSkill11;

  @FXML
  TextField tfSkill12;

  @FXML
  TextField tfSkill13;

  @FXML
  TextField tfSkill14;

  @FXML
  TextField tfSkillCost00;

  @FXML
  TextField tfSkillCost01;

  @FXML
  TextField tfSkillCost02;

  @FXML
  TextField tfSkillCost03;

  @FXML
  TextField tfSkillCost04;

  @FXML
  TextField tfSkillCost05;

  @FXML
  TextField tfSkillCost06;

  @FXML
  TextField tfSkillCost07;

  @FXML
  TextField tfSkillCost08;

  @FXML
  TextField tfSkillCost09;

  @FXML
  TextField tfSkillCost10;

  @FXML
  TextField tfSkillCost11;

  @FXML
  TextField tfSkillCost12;

  @FXML
  TextField tfSkillCost13;

  @FXML
  TextField tfSkillCost14;

  @FXML
  Label bSpeedCost;

  @FXML
  Label bMoveCost;

  @FXML
  Label setThurst;

  @FXML
  Label setSwing;

  @FXML
  Label stCost;

  @FXML
  Label dxCost;

  @FXML
  Label iqCost;

  @FXML
  Label htCost;

  @FXML
  Label hpCost;

  @FXML
  Label willCost;

  @FXML
  Label perCost;

  @FXML
  Label fpCost;

  @FXML
  Label lbDodge;

  @FXML
  Label lbParry;

  @FXML
  Label lbBlock;

  @FXML
  Label lbLanCost00;

  @FXML
  Label skCost01;
  @FXML
  Label skCost02;
  @FXML
  Label skCost03;
  @FXML
  Label skCost04;
  @FXML
  Label skCost05;
  @FXML
  Label skCost06;
  @FXML
  Label skCost07;
  @FXML
  Label skCost08;
  @FXML
  Label skCost09;
  @FXML
  Label skCost10;
  @FXML
  Label skCost11;
  @FXML
  Label skCost12;
  @FXML
  Label skCost13;
  @FXML
  Label skCost14;
  @FXML
  Label skCost15;

  @FXML
  Label psuCost01;

  @FXML
  Label psuCost02;

  @FXML
  Label psuCost03;

  @FXML

  Label psuCost04;

  @FXML

  Label psuCost05;

  @FXML
  Label pscuCost06;

  @FXML
  Label lbLanCost01;

  @FXML
  Label lbLanCost02;

  @FXML
  Label lbLanCost03;

  @FXML
  Label lbCultCost00;

  @FXML
  Label lbCultCost01;

  @FXML
  Label lbCultCost02;

  @FXML
  Label lbCultCost03;

  @FXML
  Label lbPtSummary00;

  @FXML
  Label lbPtSummary01;

  @FXML
  Label lbPtSummary02;

  @FXML
  Label lbPtSummary03;

  @FXML
  TextField ptTotalSet;

  @FXML
  Label lbUnspentPoints;

  @FXML
  Label lbBasicLift;

  @FXML
  Button btPsiMagic;

  @FXML
  ComboBox<Languages> spoken1;

  @FXML
  ComboBox<Languages> spoken2;

  @FXML
  ComboBox<Languages> spoken3;

  @FXML
  ComboBox<Languages> spoken4;

  @FXML
  ComboBox<Languages> written1;

  @FXML
  ComboBox<Languages> written2;

  @FXML
  ComboBox<Languages> written3;

  @FXML
  ComboBox<Languages> written4;

  private void bindAttr(TextInputControl field, Object initialValue, Runnable onCalculate) { // listener main structure
    field.setText(String.valueOf(initialValue));
    field.setStyle("-fx-border-color: green;");

    field.textProperty().addListener((obs, oldValue, newValue) -> {
      if (newValue == null || newValue.trim().isEmpty()) {
        field.setStyle("-fx-border-color: orange;");
        return;
      }

      if (!newValue.matches("\\d+")) {
        field.setText(oldValue);
        return;
      }

      try {
        int value = Integer.parseInt(newValue.trim());

        if (value >= 1) {
          field.setStyle("-fx-border-color: green;");
          onCalculate.run();
        } else {
          field.setStyle("-fx-border-color: red;");
        }
      } catch (NumberFormatException e) {
        field.setStyle("-fx-border-color: red;");
      }
    });

    field.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
      if (!isNowFocused) {
        String text = field.getText();
        if (text == null || text.trim().isEmpty() || Integer.parseInt(text.trim()) < 1) {
          field.setText("1");
          field.setStyle("-fx-border-color: green;");
          onCalculate.run();
        }
      }
    });
  }

  // Damage Table
  private void dmgRegister() {
    gdpDmgTable.put(1, "1d-6");
    gdpDmgTable.put(2, "1d-6");
    gdpDmgTable.put(3, "1d-5");
    gdpDmgTable.put(4, "1d-5");
    gdpDmgTable.put(5, "1d-4");
    gdpDmgTable.put(6, "1d-4");
    gdpDmgTable.put(7, "1d-3");
    gdpDmgTable.put(8, "1d-3");
    gdpDmgTable.put(9, "1d-2");
    gdpDmgTable.put(10, "1d-2");
    gdpDmgTable.put(11, "1d-1");
    gdpDmgTable.put(12, "1d-1");
    gdpDmgTable.put(13, "1d");
    gdpDmgTable.put(14, "1d");
    gdpDmgTable.put(15, "1d+1");
    gdpDmgTable.put(16, "1d+1");
    gdpDmgTable.put(17, "1d+2");
    gdpDmgTable.put(18, "1d+2");
    gdpDmgTable.put(19, "2d-1");
    gdpDmgTable.put(20, "2d-1");
    gdpDmgTable.put(21, "2d");
    gdpDmgTable.put(22, "2d");
    gdpDmgTable.put(23, "2d+1");
    gdpDmgTable.put(24, "2d+1");
    gdpDmgTable.put(25, "2d+2");
    gdpDmgTable.put(26, "2d+2");
    gdpDmgTable.put(27, "3d-1");
    gdpDmgTable.put(28, "3d-1");
    gdpDmgTable.put(29, "3d");
    gdpDmgTable.put(30, "3d");
    gdpDmgTable.put(31, "3d+1");
    gdpDmgTable.put(32, "3d+1");
    gdpDmgTable.put(33, "3d+2");
    gdpDmgTable.put(34, "3d+2");
    gdpDmgTable.put(35, "4d-1");
    gdpDmgTable.put(36, "4d-1");
    gdpDmgTable.put(37, "4d");
    gdpDmgTable.put(38, "4d");
    gdpDmgTable.put(39, "4d+1");
    gdpDmgTable.put(40, "4d+1");
    gdpDmgTable.put(41, "4d+2");
    gdpDmgTable.put(42, "4d+2");
    gdpDmgTable.put(43, "5d-1");
    gdpDmgTable.put(44, "5d-1");
    gdpDmgTable.put(45, "5d");
    gdpDmgTable.put(46, "5d+1");
    gdpDmgTable.put(47, "5d+1");
    gdpDmgTable.put(48, "5d+2");
    gdpDmgTable.put(49, "5d+2");
    gdpDmgTable.put(50, "5d+2");
    gdpDmgTable.put(51, "6d-1");
    gdpDmgTable.put(52, "6d-1");
    gdpDmgTable.put(53, "6d-1");
    gdpDmgTable.put(54, "6d");
    gdpDmgTable.put(55, "6d");
    gdpDmgTable.put(56, "6d-1");
    gdpDmgTable.put(57, "6d-1");
    gdpDmgTable.put(58, "6d");
    gdpDmgTable.put(59, "6d");
    gdpDmgTable.put(60, "7d-1");
    gdpDmgTable.put(61, "7d-1");
    gdpDmgTable.put(62, "7d");
    gdpDmgTable.put(63, "7d");
    gdpDmgTable.put(64, "7d+1");
    gdpDmgTable.put(65, "7d+1");
    gdpDmgTable.put(66, "7d+2");
    gdpDmgTable.put(67, "7d+2");
    gdpDmgTable.put(68, "8d-1");
    gdpDmgTable.put(69, "8d-1");
    gdpDmgTable.put(70, "8d");
    gdpDmgTable.put(71, "8d");
    gdpDmgTable.put(72, "8d+1");
    gdpDmgTable.put(73, "8d+1");
    gdpDmgTable.put(74, "8d+2");
    gdpDmgTable.put(75, "8d+2");
    gdpDmgTable.put(76, "9d-1");
    gdpDmgTable.put(77, "9d-1");
    gdpDmgTable.put(78, "9d");
    gdpDmgTable.put(79, "9d");
    gdpDmgTable.put(80, "9d");
    gdpDmgTable.put(81, "9d+1");
    gdpDmgTable.put(82, "9d+1");
    gdpDmgTable.put(83, "9d+2");
    gdpDmgTable.put(84, "9d+2");
    gdpDmgTable.put(85, "9d+2");
    gdpDmgTable.put(86, "10d-1");
    gdpDmgTable.put(87, "10d-1");
    gdpDmgTable.put(88, "10d");
    gdpDmgTable.put(89, "10d");
    gdpDmgTable.put(90, "10d");
    gdpDmgTable.put(91, "10d+1");
    gdpDmgTable.put(92, "10d+1");
    gdpDmgTable.put(93, "10d+2");
    gdpDmgTable.put(94, "10d+2");
    gdpDmgTable.put(95, "10d+2");
    gdpDmgTable.put(96, "11d-1");
    gdpDmgTable.put(97, "11d-1");
    gdpDmgTable.put(98, "11d");
    gdpDmgTable.put(99, ":written311d");
    gdpDmgTable.put(100, "11d");

    // ==========================================
    // SWING TABLE
    // ==========================================
    balDmgTable.put(1, "");
    balDmgTable.put(2, "");
    balDmgTable.put(3, "");
    balDmgTable.put(4, "");
    balDmgTable.put(5, "");
    balDmgTable.put(6, "");
    balDmgTable.put(7, "");
    balDmgTable.put(8, "");
    balDmgTable.put(9, "");
    balDmgTable.put(10, "");
    balDmgTable.put(11, "");
    balDmgTable.put(12, "");
    balDmgTable.put(13, "");
    balDmgTable.put(14, "");
    balDmgTable.put(15, "");
    balDmgTable.put(16, "");
    balDmgTable.put(17, "");
    balDmgTable.put(18, "");
    balDmgTable.put(19, "");
    balDmgTable.put(20, "");
    balDmgTable.put(21, "");
    balDmgTable.put(22, "");
    balDmgTable.put(23, "");
    balDmgTable.put(24, "");
    balDmgTable.put(25, "");
    balDmgTable.put(26, "");
    balDmgTable.put(27, "");
    balDmgTable.put(28, "");
    balDmgTable.put(29, "");
    balDmgTable.put(30, "");
    balDmgTable.put(31, "");
    balDmgTable.put(32, "");
    balDmgTable.put(33, "");
    balDmgTable.put(34, "");
    balDmgTable.put(35, "");
    balDmgTable.put(36, "");
    balDmgTable.put(37, "");
    balDmgTable.put(38, "");
    balDmgTable.put(39, "");
    balDmgTable.put(40, "");
    balDmgTable.put(41, "");
    balDmgTable.put(42, "");
    balDmgTable.put(43, "");
    balDmgTable.put(44, "");
    balDmgTable.put(45, "");
    balDmgTable.put(46, "");
    balDmgTable.put(47, "");
    balDmgTable.put(48, "");
    balDmgTable.put(49, "");
    balDmgTable.put(50, "");
    balDmgTable.put(51, "");
    balDmgTable.put(52, "");
    balDmgTable.put(53, "");
    balDmgTable.put(54, "");
    balDmgTable.put(55, "");
    balDmgTable.put(56, "");
    balDmgTable.put(57, "");
    balDmgTable.put(58, "");
    balDmgTable.put(59, "");
    balDmgTable.put(60, "");
    balDmgTable.put(61, "");
    balDmgTable.put(62, "");
    balDmgTable.put(63, "");
    balDmgTable.put(64, "");
    balDmgTable.put(65, "");
    balDmgTable.put(66, "");
    balDmgTable.put(67, "");
    balDmgTable.put(68, "");
    balDmgTable.put(69, "");
    balDmgTable.put(70, "");
    balDmgTable.put(71, "");
    balDmgTable.put(72, "");
    balDmgTable.put(73, "");
    balDmgTable.put(74, "");
    balDmgTable.put(75, "");
    balDmgTable.put(76, "");
    balDmgTable.put(77, "");
    balDmgTable.put(78, "");
    balDmgTable.put(79, "");
    balDmgTable.put(80, "");
    balDmgTable.put(81, "");
    balDmgTable.put(82, "");
    balDmgTable.put(83, "");
    balDmgTable.put(84, "");
    balDmgTable.put(85, "");
    balDmgTable.put(86, "");
    balDmgTable.put(87, "");
    balDmgTable.put(88, "");
    balDmgTable.put(89, "");
    balDmgTable.put(90, "");
    balDmgTable.put(91, "");
    balDmgTable.put(92, "");
    balDmgTable.put(93, "");
    balDmgTable.put(94, "");
    balDmgTable.put(95, "");
    balDmgTable.put(96, "");
    balDmgTable.put(97, "");
    balDmgTable.put(98, "");
    balDmgTable.put(99, "");
    balDmgTable.put(100, "");

  }

  private int parseOrDefault(String text, int defaultValue) {
    if (text == null || text.trim().isEmpty())
      return defaultValue;
    try {
      return Integer.parseInt(text.trim());
    } catch (NumberFormatException e) {
      return defaultValue;
    }
  }

  private void updateDamageDisplay() {
    try {
      String stText = stSet.getText();
      if (stText == null || stText.trim().isEmpty()) {
        setThurst.setText("-");
        return;
      }

      int currentSt = Integer.parseInt(stText.trim());
      String dmgGdp;
      String dmgBal;

      if (currentSt >= 100) {
        int extraDice = (currentSt - 100) / 10;
        int totalDiceGdp = 11 + extraDice;
        int totalDiceBal = 13 + extraDice;
        dmgGdp = totalDiceGdp + "d";
        dmgBal = totalDiceBal + "d";
      } else {
        dmgGdp = gdpDmgTable.getOrDefault(currentSt, "-");
        dmgBal = balDmgTable.getOrDefault(currentSt, "-");
      }

      setThurst.setText(dmgGdp);
      setSwing.setText(dmgBal);

    } catch (NumberFormatException e) {
      setThurst.setText("-");
      setSwing.setText("-");
    }

  }

  public void initialize() {
    dmgRegister(); // Initialize Damage Table

    bindAttr(stSet, getSt(), this::stCalculate);
    bindAttr(dxSet, getDx(), this::dxCalculate);
    bindAttr(iqSet, getIq(), this::iqCalculate);
    bindAttr(htSet, getHt(), this::htCalculate);
    updateDamageDisplay();

    bindAttr(hpSet, stSet.getText(), this::hpCalculate);
    bindAttr(willSet, iqSet.getText(), this::willCalculate);
    bindAttr(perSet, iqSet.getText(), this::perCalculate);
    bindAttr(fpSet, htSet.getText(), this::fpCalculate);

    bindAttr(ptTotalSet, ptTotalSet.getText(), this::getPointTotal);
    bindAttr(tfAdCost00, tfAdCost00.getText(), this::advantageCalculate);

    bSpeedSet.setText(String.format("%.2f", (getBasicSpeed()))); // Basic speed can have decimal places
    bMoveSet.setText(String.valueOf(getBasicMove()));
    lbDodge.setText(String.valueOf(getBasicMove()));
    lbBasicLift.setText(String.valueOf(getBasicLift()));
    ptTotalSet.setText(String.valueOf(getPointTotal())); // Method to get total points for the character

    // Basic calculation calls
    pointTotalCalculate(); // Method to keep track of spending/remaining character points
    stCalculate();
    dxCalculate();
    iqCalculate();
    htCalculate();
    hpCalculate();
    willCalculate();
    perCalculate();
    fpCalculate();
    settingBasicMove();
    settingBasicSpeed();
    settingBasicLift();
    bSpeedCalculate();
    bMoveCalculate();

  }

  // Damage Tables' HashMaps
  private static final Map<Integer, String> gdpDmgTable = new HashMap<>();
  private static final Map<Integer, String> balDmgTable = new HashMap<>();

  public void pointTotalCalculate() {

    setPointTotal(parseOrDefault(ptTotalSet.getText(), 0));
    settingUnspentPoints();
    lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));

  }

  public void advantageCalculate() {

    int points = parseOrDefault(tfAdCost00.getText(), 0);
    setAdvAdvantPoints(points);
    settingUnspentPoints();
    lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));

  }

  public void stCalculate() {
    int currentSt = Integer.parseInt(stSet.getText().trim());

    setSt(currentSt);
    settingBasicLift();
    lbBasicLift.setText(String.valueOf(getBasicLift()));
    updateDamageDisplay();

    hpSet.setText(String.valueOf(currentSt));
    hpCalculate();

    setStPoints((currentSt - 10) * 10);
    stCost.setText(String.valueOf(getStPoints()));

    settingUnspentPoints();
    lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
  }

  public void dxCalculate() {
    int currentDx = Integer.parseInt(dxSet.getText());
    setDx(currentDx);
    settingBasicSpeed();
    settingBasicMove();
    bSpeedSet.setText(String.valueOf(getBasicSpeed()));
    bMoveSet.setText(String.valueOf(getBasicMove()));
    lbDodge.setText(String.valueOf(getBasicMove()));
    bSpeedCalculate();
    bMoveCalculate();
    setDxPoints((currentDx - 10) * 20);
    dxCost.setText(String.valueOf(getDxPoints()));
    settingUnspentPoints();
    lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
  }

  public void iqCalculate() {
    try {
      int currentIq = Integer.parseInt(iqSet.getText());
      setIq(currentIq);
      if (currentIq > 10) {
        willSet.setText(iqSet.getText());
        perSet.setText(iqSet.getText());
        willCalculate();
        perCalculate();
        setIqPoints((currentIq - 10) * 20);
        iqCost.setText(String.valueOf(getIqPoints()));
        settingUnspentPoints();
        lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      } else {
        willSet.setText(iqSet.getText());
        perSet.setText(iqSet.getText());
        willCalculate();
        perCalculate();
        setIqPoints((10 - currentIq) * -20);
        iqCost.setText(String.valueOf(getIqPoints()));
        settingUnspentPoints();
        lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      }

    } catch (NumberFormatException e) {
      iqSet.setStyle("-fx-border-color: red;");
      iqCost.setText("0");
      setIq(1);
      willCalculate();
      perCalculate();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    }
  }

  public void htCalculate() {
    try {
      int currentHt = Integer.parseInt(htSet.getText());
      fpSet.setText(htSet.getText());
      setHt(currentHt);
      fpCalculate();
      settingBasicSpeed();
      settingBasicMove();
      bSpeedSet.setText(String.valueOf(getBasicSpeed()));
      bMoveSet.setText(String.valueOf(getBasicMove()));
      lbDodge.setText(String.valueOf(getBasicMove()));
      bSpeedCalculate();
      bMoveCalculate();
      if (currentHt > 10) {
        setHtPoints((currentHt - 10) * 10);
        htCost.setText(String.valueOf(getHtPoints()));
        settingUnspentPoints();
        lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      } else {
        setHtPoints((10 - currentHt) * -10);
        htCost.setText(String.valueOf(getHtPoints()));
        settingUnspentPoints();
        lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      }

    } catch (NumberFormatException e) {
      htSet.setStyle("-fx-border-color: red;");
      htCost.setText("0");
      fpCalculate();
      settingBasicSpeed();
      settingBasicMove();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));

    }

  }

  public void hpCalculate() {

    if (Integer.parseInt(hpSet.getText()) > Integer.parseInt(stSet.getText())) {
      setHpPoints((Integer.parseInt(hpSet.getText()) - (Integer.parseInt(stSet.getText()))) * 2);
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      hpCost.setText(String.valueOf(getHpPoints()));
    } else if (Integer.parseInt(hpSet.getText()) == Integer.parseInt(stSet.getText())) {
      setHpPoints(0);
      hpCost.setText(String.valueOf(getHpPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));

    } else {
      setHpPoints(0);
      // hpSet.setText(stSet.getText());

    }
  }

  public void willCalculate() {

    if (Integer.parseInt(willSet.getText()) > Integer.parseInt(iqSet.getText())) {
      setWillPoints((Integer.parseInt(willSet.getText()) - (Integer.parseInt(iqSet.getText()))) * 2);
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      willCost.setText(String.valueOf(getWillPoints()));
    } else if (Integer.parseInt(willSet.getText()) == Integer.parseInt(iqSet.getText())) {
      setWillPoints(0);
      willCost.setText(String.valueOf(getWillPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));

    } else {
      setWillPoints(0);

    }
  }

  public void perCalculate() {

    if (Integer.parseInt(perSet.getText()) > Integer.parseInt(iqSet.getText())) {
      setPerPoints((Integer.parseInt(perSet.getText()) - (Integer.parseInt(iqSet.getText()))) * 2);
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      perCost.setText(String.valueOf(getPerPoints()));
    } else if (Integer.parseInt(perSet.getText()) == Integer.parseInt(iqSet.getText())) {
      setPerPoints(0);
      perCost.setText(String.valueOf(getWillPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));

    } else {
      setPerPoints(0);
      // perSet.setText(iqSet.getText());

    }
  }

  public void fpCalculate() {

    if (Integer.parseInt(fpSet.getText()) > Integer.parseInt(htSet.getText())) {
      setFatPoints((Integer.parseInt(fpSet.getText()) - (Integer.parseInt(htSet.getText()))) * 2);
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      fpCost.setText(String.valueOf(getFatPoints()));
    } else if (Integer.parseInt(fpSet.getText()) == Integer.parseInt(htSet.getText())) {
      setPerPoints(0);
      fpCost.setText(String.valueOf(getFatPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));

    } else {
      setFatPoints(0);
      // fpSet.setText(htSet.getText());

    }
  }

  public void bSpeedCalculate() {
    settingBasicSpeed();
    if (Double.parseDouble(bSpeedSet.getText()) > getBasicSpeed()) {
      Double tempCalc = (((Double.parseDouble(bSpeedSet.getText()) - getBasicSpeed())) / 0.25) * 5;
      int fnBspeedPoints = (int) Math.round(tempCalc);
      bSpeedCost.setText(String.valueOf(fnBspeedPoints));
      setBasicSpeedPoints(Integer.parseInt(bSpeedCost.getText()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    } else {
      setBasicSpeedPoints(0);
      bSpeedCost.setText("0");
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    }
  }

  public void bMoveCalculate() {
    settingBasicMove();
    lbDodge.setText(String.valueOf(getBasicMove()));
    if ((Integer.parseInt(bMoveSet.getText()) > getBasicMove())) {
      setBasicMovePoints((Integer.parseInt(bMoveSet.getText()) - getBasicMove()) * 5);
      bMoveCost.setText(String.valueOf(getBasicMovePoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    } else {
      setBasicMovePoints(0);
      bMoveCost.setText("0");
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    }
  }

}
