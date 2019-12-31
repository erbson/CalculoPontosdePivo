/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static demo.MovingAverageDemo1.createChart;
import static demo.orsoncharts.swing.CategoryMarkerDemo1.createDataset;
import java.util.Calendar;
import java.util.Date;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultHighLowDataset;
import static org.jfree.date.DateUtilities.createDate;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Erbson
 */
public class GraficoCandlestick extends ApplicationFrame {

    public GraficoCandlestick(String title) {

        super(title);
        final DefaultHighLowDataset dataset = (DefaultHighLowDataset) createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 350));
        setContentPane(chartPanel);

    }
    
     CalculaPontosDePivo ponto = new CalculaPontosDePivo();
    
    private DefaultHighLowDataset createDataset() {
        
       
                

  int serice = 4;

  Date[] date = new Date[serice];
  double[] high = new double[serice];
  double[] low = new double[serice];
  double[] open = new double[serice];
  double[] close = new double[serice];
  double[] volume = new double[serice];
    
        date[0]  = createDate(2019, Calendar.OCTOBER,4);
        high[0]  =45.0;
        low[0]   = 33.0;
        open[0]  = 35.0;
        close[0] = 33.0;
        volume[0] = 100.0;
        
        date[1]  = createDate(2019, Calendar.OCTOBER,5);
        high[1]  =80.0;
        low[1]   = 33.0;
        open[1]  = 35.0;
        close[1] = 68.0;
        volume[2] = 43434.0; 
        
        date[2]  = createDate(2019, Calendar.NOVEMBER,6);
        high[2]  =55.0;
        low[2]   = 44.0;
        open[2]  = 22.0;
        close[2] = 34.0;
        volume[2] = 6789.0;
        date[3] = createDate(2019, Calendar.NOVEMBER,7);
         high[3] = ponto.maxima;
         low[3]= ponto.minima;
         open[3]=ponto.fechamento;
         close[3] = ponto.fechamento;
         volume[3] = 55000.0;
        
        

  DefaultHighLowDataset data = new DefaultHighLowDataset(
  "", date, high, low, open, close, volume);
  return data;
  }
    
    
    
    
   

    private JFreeChart createChart(final DefaultHighLowDataset dataset) {
        final JFreeChart chart = ChartFactory.createCandlestickChart(
                "EMPRESA X NA BOLSA DE VALORES ", "Dias", "Preço", dataset, false);
        return chart;
    }

    public static void main(String[] args) {

        GraficoCandlestick chart = new GraficoCandlestick("Calculando ponto de Pivô");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);

    }

}
