package gui;

import java.text.NumberFormat;

import entities.Attributes;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainViewController extends Attributes {
  // FXML correspondence of each element on the frontend: TextFields, Labels and
  // Button
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

  // Basic values for text fields and labels
  public void initialize() {
    stSet.setText(String.valueOf(getSt())); // Initial values found in Attributes.java
    dxSet.setText(String.valueOf(getDx()));
    iqSet.setText(String.valueOf(getIq()));
    htSet.setText(String.valueOf(getHt()));
    hpSet.setText(stSet.getText()); // In GURPS, initial hp = st
    willSet.setText(iqSet.getText()); // In GURPS, initial will = iq
    perSet.setText(iqSet.getText()); // In GURPS, initial per = iq
    fpSet.setText(htSet.getText()); // In GURPS, initial fp = ht
    bSpeedSet.setText(String.format("%.2f", (getBasicSpeed()))); // Basic speed can have decimal places
    bMoveSet.setText(String.valueOf(getBasicMove())); // Basic move is rounded down
    lbDodge.setText(String.valueOf(getBasicMove())); // Base dodge is based on Basic Move
    lbBasicLift.setText(String.valueOf(getBasicLift())); // Basic lift has specific calculation
    ptTotalSet.setText(String.valueOf(getPointTotal())); // Method to get total points for the character, defined by
                                                         // user
    // Listeners to check values in real time
    stSet.textProperty().addListener((observable, oldValue, newValue) -> {
      stSet.setStyle("");
      if (newValue == null || newValue.trim().isEmpty()) { // Validating empty entries. The same method is applied for
                                                           // the remaining attributes

        stSet.setStyle("-fx-border-color: orange;");
        return;
      }
      if (!newValue.matches("\\d+")) {
        stSet.setText(oldValue);
        stSet.setStyle("-fx-border-color: red;");
        return;
      }
      int parsedSt; // Temporary variable to store current attribute value
      parsedSt = Integer.parseInt(newValue);
      // Attributes can't be less than 1
      if (parsedSt < 1) {
        stSet.setText("1");
        stSet.setStyle("-fx-border-color: red;");
      } else {
        stSet.setStyle("-fx-border-color: green;");
      }
    });

    dxSet.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue == null || newValue.trim().isEmpty()) {
        dxSet.setStyle("-fx-border-color: orange;");
        return;
      }
      if (!newValue.matches("\\d+")) {
        dxSet.setText(oldValue);
        dxSet.setStyle("-fx-border-color: red;");
        return;
      }
      int parsedDx;
      parsedDx = Integer.parseInt(newValue);
      if (parsedDx < 1) {
        dxSet.setText("1");
        dxSet.setStyle("-fx-border-color: red;");
      } else {
        dxSet.setStyle("-fx-border-color: green;");
      }
    });

    iqSet.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue == null || newValue.trim().isEmpty()) {
        iqSet.setStyle("-fx-border-color: orange;");
        return;
      }
      if (!newValue.matches("\\d+")) {
        iqSet.setText(oldValue);
        iqSet.setStyle("-fx-border-color: red;");
        return;
      }
      int parsedIq;
      parsedIq = Integer.parseInt(newValue);
      if (parsedIq < 1) {
        iqSet.setText("1");
        iqSet.setStyle("-fx-border-color: red;");
      } else {
        iqSet.setStyle("-fx-border-color: green;");
      }
    });

    htSet.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue == null || newValue.trim().isEmpty()) {
        htSet.setStyle("-fx-border-color: orange;");
        return;
      }
      if (!newValue.matches("\\d+")) {
        htSet.setText(oldValue);
        htSet.setStyle("-fx-border-color: red;");
        return;
      }
      int parsedHt;
      parsedHt = Integer.parseInt(newValue);
      if (parsedHt < 1) {
        htSet.setText("1");
        htSet.setStyle("-fx-border-color: red;");
      } else {
        htSet.setStyle("-fx-border-color: green;");
      }
    });

    hpSet.textProperty().addListener((observable, oldValue, newValue) -> {
      hpSet.setStyle("");
      if (newValue == null || newValue.trim().isEmpty()) {
        hpSet.setStyle("-fx-border-color: orange;");
        return;
      }
      if (!newValue.matches("\\d+")) {
        hpSet.setText(oldValue);
        hpSet.setStyle("-fx-border-color: red;");
        return;
      }

    });

    willSet.textProperty().addListener((observable, oldValue, newValue) -> {
      willSet.setStyle("");
      if (newValue == null || newValue.trim().isEmpty()) {
        willSet.setStyle("-fx-border-color: orange;");
        return;
      }
      if (!newValue.matches("\\d+")) {
        willSet.setText(oldValue);
        willSet.setStyle("-fx-border-color: red;");
        return;
      }
    });

    perSet.textProperty().addListener((observable, oldValue, newValue) -> {
      perSet.setStyle("");
      if (newValue == null || newValue.trim().isEmpty()) {
        perSet.setStyle("-fx-border-color: orange;");
        return;
      }
      if (!newValue.matches("\\d+")) {
        perSet.setText(oldValue);
        perSet.setStyle("-fx-border-color: red;");
        return;
      }

    });

    fpSet.textProperty().addListener((observable, oldValue, newValue) -> {
      fpSet.setStyle("");
      if (newValue == null || newValue.trim().isEmpty()) {
        fpSet.setStyle("-fx-border-color: orange;");
        return;
      }
      if (!newValue.matches("\\d+")) {
        fpSet.setText(oldValue);
        fpSet.setStyle("-fx-border-color: red;");
        return;
      }

    });

    // Basic calculation calls
    pointTotalCalculate(); // Method to keep track of spending/remaining character points
    stCalculate(); // ST points and sub-attributes calculation
    dxCalculate(); // DX points calculation and basic speed and move
    iqCalculate(); // IQ points calculation, as well as base will and per
    htCalculate(); // HT points calculation and base HP
    hpCalculate(); // HP points calculation if HP is higher than ST
    willCalculate(); // will points calculation if will is higher than IQ
    perCalculate(); // per points calculation if per is higher than IQ
    fpCalculate(); // fatigue points calculation if FP is higher than HT
    settingBasicMove(); // Starting Basic Move value
    settingBasicSpeed(); // Starting Basic Speed value
    settingBasicLift(); // Starting Basic Lift value
    bSpeedCalculate(); // Calling extra speed points if any
    bMoveCalculate(); // Calling extra move points if any

  }

  // Total character points calculation
  public void pointTotalCalculate() {
    lbUnspentPoints.setText(ptTotalSet.getText()); // Label of unspent points receives the point total determined user
    setPointTotal(Integer.parseInt(ptTotalSet.getText())); // Value, once a String, parsed to Integer
    settingUnspentPoints(); // Call method from Attributes class
    lbUnspentPoints.setText(String.valueOf(getUnspentPoints())); // Set the final value for the label
  }

  // Attributes points calculation

  // This method calculates character points spent (or acquired) from the ST
  // It also determines the initial hp
  public void stCalculate() {
    try {

      int currentSt = Integer.parseInt(stSet.getText()); // Getting the TextField value and storing in a local variable
      setSt(currentSt); // Updating ST Label with current value
      settingBasicLift(); // Calling method to calculate Basic Lift
      lbBasicLift.setText(String.valueOf(getBasicLift())); // Updating Basic Lift label

      if (currentSt > 10) { // if the player is "buying" a value above 10
        hpSet.setText(String.valueOf(currentSt)); // set the corresponding hp
        hpCalculate(); // call the hp calculation
        setStPoints((currentSt - 10) * 10); // formula to get the amount of points for St above 10
        stCost.setText(String.valueOf(getStPoints())); // update amount on the st cost label
        settingUnspentPoints(); // update points total
        lbUnspentPoints.setText(String.valueOf(getUnspentPoints())); // update label of unspent points

      } else if (currentSt < 1) { // attributes don't go below 1 in GURPS.
        stSet.setText("1");

      } else {
        hpSet.setText(stSet.getText()); // hp update again, but this time for values below 10
        hpCalculate();
        setStPoints((10 - currentSt) * -10); // formula for negative values
        stCost.setText(String.valueOf(getStPoints()));
        settingUnspentPoints();
        lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      }
    } catch (NumberFormatException e) {
      // Recovery action in case of exception
      stSet.setStyle("-fx-border-color: red;"); // a graphic representation of a red border on the text field
      stCost.setText("0"); // reset cost label
      setSt(1); // reset St
      hpCalculate(); // calculate base hp again
      settingUnspentPoints(); // also calculate points
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    }

  }

  public void dxCalculate() {
    try {
      int currentDx = Integer.parseInt(dxSet.getText()); // temp variable to store value
      setDx(currentDx); // setting Dx textfield
      settingBasicSpeed(); // calling Basic Speed calculation and Basic Move calculation
      settingBasicMove(); // they're needed everytime Dx changes and correspond to the basic values of
                          // each
      bSpeedSet.setText(String.valueOf(getBasicSpeed())); // updating textfields
      bMoveSet.setText(String.valueOf(getBasicMove()));
      lbDodge.setText(String.valueOf(getBasicMove()));
      bSpeedCalculate(); // here's the method to get spent points on each attribute
      bMoveCalculate();

      if (currentDx > 10) { // the same if chain that validates the amount of points spent for each
                            // attribute, here, Dx
        setDxPoints((currentDx - 10) * 20); // Values above 10
        dxCost.setText(String.valueOf(getDxPoints()));
        settingUnspentPoints();
        lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      } else if (currentDx < 1) {
        dxSet.setText("1");
      } else {
        setDxPoints((10 - currentDx) * -20);
        dxCost.setText(String.valueOf(getDxPoints()));
        settingUnspentPoints();
        lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
      }

    } catch (NumberFormatException e) {
      dxSet.setStyle("-fx-border-color: red;");
      dxCost.setText("1");
      setDx(1);
      bSpeedCalculate();
      bMoveCalculate();
    }
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
      } else if (currentIq < 1) {
        iqSet.setText("1");
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
      } else if (currentHt < 1) {
        htSet.setText("1");
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
      hpSet.setText(stSet.getText());

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
      willSet.setText(iqSet.getText());

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
      perSet.setText(iqSet.getText());

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
      fpSet.setText(htSet.getText());

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
