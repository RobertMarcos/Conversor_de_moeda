package javinha;
import java.math.*;
import java.math.RoundingMode;
public class Conversao{
protected double valor;
protected int moe5 = 0;	
private int casas = 2; 
double res =0;	
protected void setValor(double valor) {
	this.valor = valor;
	
	return;
}

protected void setMoedaE(int moEs) {
	this.moe5 = moEs;
	return;
}


protected double getMoEsc() {
	
	
	switch (moe5){
	
		case 1:
			double Dol = valor * 0.21;
			res = Dol;
			break;
		case 2:
			double Euro = valor *0.18;
			res = Euro;
			break;
		case 5:
			double libE = valor *0.16;
			res = libE;
			break;
		case 3:
			double PesoA = valor* 55.6;
			res = PesoA;
			break;
		case 4:
			double PesoC = valor * 169.55;
			res = PesoC;
			break;
			
	}
	BigDecimal df = new BigDecimal(res);
df.setScale(casas,RoundingMode.HALF_UP);
double resf = df.doubleValue(); 
	return resf;
}





}
