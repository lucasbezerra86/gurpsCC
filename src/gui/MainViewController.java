package gui;

import entities.Attributes;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainViewController extends Attributes {

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
    stSet.setText(String.valueOf(getSt()));
    dxSet.setText(String.valueOf(getDx()));
    iqSet.setText(String.valueOf(getIq()));
    htSet.setText(String.valueOf(getHt()));
    hpSet.setText(stSet.getText());
    willSet.setText(iqSet.getText());
    perSet.setText(iqSet.getText());
    fpSet.setText(htSet.getText());
    bSpeedSet.setText(String.format("%.2f", (getBasicSpeed())));
    bMoveSet.setText(String.valueOf(getBasicMove()));
    lbDodge.setText(String.valueOf(getBasicMove()));
    lbBasicLift.setText(String.valueOf(getBasicLift()));
    ptTotalSet.setText(String.valueOf(getPointTotal()));
    pointTotalCalculate();
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

  // Total character points calculation
  public void pointTotalCalculate() {
    lbUnspentPoints.setText(ptTotalSet.getText());
    setPointTotal(Integer.parseInt(ptTotalSet.getText()));
    settingUnspentPoints();
    lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
  }

  // Attributes points calculation
  public void stCalculate() {
    setSt(Integer.parseInt(stSet.getText()));
    settingBasicLift();
    lbBasicLift.setText(String.valueOf(getBasicLift()));
    if (Integer.parseInt(stSet.getText()) > 10) {
      hpSet.setText(stSet.getText());
      hpCalculate();
      setStPoints((Integer.parseInt(stSet.getText()) - 10) * 10);
      stCost.setText(String.valueOf(getStPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));

    } else if (Integer.parseInt(stSet.getText()) < 1) {
      stSet.setText("1");
    } else {
      hpSet.setText(stSet.getText());
      hpCalculate();
      setStPoints((10 - Integer.parseInt(stSet.getText())) * -10);
      stCost.setText(String.valueOf(getStPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    }

  }

  public void dxCalculate() {
    setDx(Integer.parseInt(dxSet.getText()));
    settingBasicSpeed();
    settingBasicMove();
    bSpeedSet.setText(String.valueOf(getBasicSpeed()));
    bMoveSet.setText(String.valueOf(getBasicMove()));
    lbDodge.setText(String.valueOf(getBasicMove()));
    bSpeedCalculate();
    bMoveCalculate();
    if (Integer.parseInt(dxSet.getText()) > 10) {
      setDxPoints((Integer.parseInt(dxSet.getText()) - 10) * 20);
      dxCost.setText(String.valueOf(getDxPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    } else if (Integer.parseInt(dxSet.getText()) < 1) {
      dxSet.setText("1");
    } else {
      setDxPoints((10 - Integer.parseInt(dxSet.getText())) * -20);
      dxCost.setText(String.valueOf(getDxPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    }

  }

  public void iqCalculate() {
    setIq(Integer.parseInt(iqSet.getText()));
    if (Integer.parseInt(iqSet.getText()) > 10) {
      willSet.setText(iqSet.getText());
      perSet.setText(iqSet.getText());
      willCalculate();
      perCalculate();
      setIqPoints((Integer.parseInt(iqSet.getText()) - 10) * 20);
      iqCost.setText(String.valueOf(getIqPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    } else if (Integer.parseInt(iqSet.getText()) < 1) {
      iqSet.setText("1");
    } else {
      willSet.setText(iqSet.getText());
      perSet.setText(iqSet.getText());
      willCalculate();
      perCalculate();
      setIqPoints((10 - Integer.parseInt(iqSet.getText())) * -20);
      iqCost.setText(String.valueOf(getIqPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    }

  }

  public void htCalculate() {
    fpSet.setText(htSet.getText());
    setHt(Integer.parseInt(htSet.getText()));
    fpCalculate();
    settingBasicSpeed();
    settingBasicMove();
    bSpeedSet.setText(String.valueOf(getBasicSpeed()));
    bMoveSet.setText(String.valueOf(getBasicMove()));
    lbDodge.setText(String.valueOf(getBasicMove()));
    bSpeedCalculate();
    bMoveCalculate();
    if (Integer.parseInt(htSet.getText()) > 10) {
      setHtPoints((Integer.parseInt(htSet.getText()) - 10) * 10);
      htCost.setText(String.valueOf(getHtPoints()));
      settingUnspentPoints();
      lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
    } else if (Integer.parseInt(htSet.getText()) < 1) {
      htSet.setText("0");
    } else {
      setHtPoints((10 - Integer.parseInt(htSet.getText())) * -10);
      htCost.setText(String.valueOf(getHtPoints()));
      settingUnspentPoints();
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
