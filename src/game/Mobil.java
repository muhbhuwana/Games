/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author MuhammadBhuwana
 */
public class Mobil{
	private int beban;
	private int maxbeban;
	public Mobil(int maxbeban){
	this.maxbeban=maxbeban;
	beban=0;
	}
	public void addbean(int beban)
	{
	int temp;
	temp=this.beban+beban;
        System.out.println(temp);
		}
        public void cetakbeban(){

        }
}
