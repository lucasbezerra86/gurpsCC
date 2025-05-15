package gui;

import entities.Attributes;
import javafx.fxml.FXML;
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
	TextField ptTotalSet;
	
	@FXML
	Label lbUnspentPoints;
	
	
	
	
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
		
		
		}
	// Total character points calculation
	public void pointTotalCalculate() {
		lbUnspentPoints.setText(ptTotalSet.getText());
		setPointTotal(Integer.parseInt(ptTotalSet.getText()));
		setUnspentPoints(getPointTotal() - (getStPoints() + getDxPoints() + getIqPoints() + getHtPoints() + getWillPoints() + getPerPoints() + getFatPoints() + getBasicSpeedPoints() + getBasicMovePoints()));
		lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
		
	}
	
	// Attributes points calculation
	public void stCalculate() {
		
		if (Integer.parseInt(stSet.getText()) > 10) {
			hpSet.setText(stSet.getText());
			hpCalculate();
			setStPoints((Integer.parseInt(stSet.getText())-10)*10);
			stCost.setText(String.valueOf(getStPoints()));
			settingUnspentPoints();
			lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
			
		} else if (Integer.parseInt(stSet.getText()) < 1) {
			stSet.setText("0");
		} else {
			hpSet.setText(stSet.getText());
			hpCalculate();
			setStPoints((10-Integer.parseInt(stSet.getText()))*-10);
			stCost.setText(String.valueOf(getStPoints()));
			settingUnspentPoints();
			lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
		}
		
		
	}
	
public void dxCalculate() {
		
		if (Integer.parseInt(dxSet.getText()) > 10) {
			setDxPoints((Integer.parseInt(dxSet.getText())-10)*20);
			dxCost.setText(String.valueOf(getDxPoints()));
			settingUnspentPoints();
			lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
		} else if (Integer.parseInt(dxSet.getText()) < 1) {
			dxSet.setText("0");
		} else {
			setDxPoints((10-Integer.parseInt(dxSet.getText()))*-20);
			dxCost.setText(String.valueOf(getDxPoints()));
			settingUnspentPoints();
			lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
		}
		
		
	}
	
	public void iqCalculate() {
		
		if (Integer.parseInt(iqSet.getText()) > 10) {
			willSet.setText(iqSet.getText());
			perSet.setText(iqSet.getText());
			willCalculate();
			perCalculate();
			setIqPoints((Integer.parseInt(iqSet.getText())-10)*20);
			iqCost.setText(String.valueOf(getIqPoints()));
			settingUnspentPoints();
			lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
		} else if (Integer.parseInt(iqSet.getText()) < 1) {
			iqSet.setText("0");
		} else {
			willSet.setText(iqSet.getText());
			perSet.setText(iqSet.getText());
			willCalculate();
			perCalculate();
			setIqPoints((10-Integer.parseInt(iqSet.getText()))*-20);
			iqCost.setText(String.valueOf(getIqPoints()));
			settingUnspentPoints();
			lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
		}
		
		
	}
	
	public void htCalculate() {
		fpSet.setText(htSet.getText());
		fpCalculate();		
		if (Integer.parseInt(htSet.getText()) > 10) {
			setHtPoints((Integer.parseInt(htSet.getText())-10)*10);
			htCost.setText(String.valueOf(getHtPoints()));
			settingUnspentPoints();
			lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
		} else if (Integer.parseInt(htSet.getText()) < 1) {
			htSet.setText("0");
		} else {
			setHtPoints((10-Integer.parseInt(htSet.getText()))*-10);
			htCost.setText(String.valueOf(getHtPoints()));
			settingUnspentPoints();
			lbUnspentPoints.setText(String.valueOf(getUnspentPoints()));
		}
		
		
	}
	
	public void hpCalculate() {
		
		if (Integer.parseInt(hpSet.getText()) > Integer.parseInt(stSet.getText())) {
			setHpPoints((Integer.parseInt(hpSet.getText()) - (Integer.parseInt(stSet.getText())))*2);
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
			setWillPoints((Integer.parseInt(willSet.getText()) - (Integer.parseInt(iqSet.getText())))*2);
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
		setPerPoints((Integer.parseInt(perSet.getText()) - (Integer.parseInt(iqSet.getText())))*2);
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
		setFatPoints((Integer.parseInt(fpSet.getText()) - (Integer.parseInt(htSet.getText())))*2);
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
	
	
	
	
	
	

}
