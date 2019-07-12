/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwio.wc;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import javax.swing.JFrame;

/**
 *
 * @author tiago.teixeira
 */
public class WebCamUtil {

    public void test() {
        Webcam wc = Webcam.getDefault();
        wc.setViewSize(WebcamResolution.VGA.getSize());

        WebcamPanel panel = new WebcamPanel(wc);
        panel.setFPSDisplayed(true);
        panel.setDisplayDebugInfo(true);
        panel.setImageSizeDisplayed(true);
        panel.setMirrored(true);

        JFrame frame = new JFrame("Teste");
        frame.add(panel);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
