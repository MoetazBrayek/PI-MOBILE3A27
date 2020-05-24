/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.codename1.main.Controller;
import com.codename1.ui.Dialog;
import com.codename1.ui.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author Nacef
 */
public class UtilService {
    
    private static UtilService utilService;
    
    private UtilService(){}
    
    public static UtilService getInstance()
    {
        if(utilService == null) utilService = new UtilService();
        return utilService;
    }
    
    public Image getImageFromURL(String url)
    {
        try {
            Image image = Image.createImage(url);
            return image.scaled(64, 64);
        } catch (IOException ex) {
        }
        
        return null;
    }
    
	public Image getImageAlbumFromURL(String url)
    {
        try {
            Image image = Image.createImage(url);
            return image.scaled(250, 250);
        } catch (IOException ex) {
        }
        
        return null;
    }
    
    public Image getImageProfilFromURL(String url)
    {
        try {
            
            Image image = Image.createImage(url);
            return image.scaled(64, 64);
        } catch (IOException ex) {
        }
        
        return null;
    }
}
