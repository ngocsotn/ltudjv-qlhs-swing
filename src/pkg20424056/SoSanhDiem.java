/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20424056;

import java.util.Comparator;

/**
 *
 * @author NGOC
 */
public class SoSanhDiem implements Comparator<hocsinh> {
    @Override
    public int compare(hocsinh o1, hocsinh o2) {
        return o1.getDiem().compareTo(o2.getDiem());
    }
    
}
