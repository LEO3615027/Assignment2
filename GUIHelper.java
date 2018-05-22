package gUI_Interface;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SONY!
 */
public class GUIHelper {

    private GUIHelper() {
    }

    public static void setFrameCenter(JFrame jf) {
        //获取工具对象
        Toolkit tk = Toolkit.getDefaultToolkit();

        //获取屏幕宽高
        Dimension d = tk.getScreenSize();
        double screenWidth = d.getWidth();
        double screenHeight = d.getHeight();

        //获取窗体宽高
        int frameWidth = jf.getWidth();
        int frameHeight = jf.getHeight();

        //获取新的宽和�?
        int width = (int) (screenWidth - frameWidth) / 2;
        int height = (int) (screenHeight - frameHeight) / 2;

        //设置窗体坐标
        jf.setLocation(width, height);
    }
}
