import java.util.Scanner;

public class NPCMain {
	static NPC[] npcs = 
	
	
	public static void main(String[] args) {
			
		NPC[] npcs = createInitNPCS();
		
		
		//Menu option to create new NPC
		NPC newNPC = createNewNPC();
		npcs = resizeNPCArray(npcs);
		npcs[npcs.length - 1] = newNPC;
		
		
	}
	
	public static NPC[] createInitNPCS() {
		
	}
	
	
	
	public static NPC[] resizeNPCArray(NPC[] orig) {
		NPC[] temp = new NPC[orig.length + 1];
		
	
	
		//System.arraycopy(orig, 0, temp, 0, orig.length);
		
		for (int i = 0 ; i < orig.length ; i++) {
			temp[i] = orig[i];
		}
	
		return temp;
	}
	
	
	
	public static NPC createNewNPC() {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter the npc's name: ");
		String name = in.nextLine();
		
		//Read all the information;
		
		
		System.out.println("How many lines of dialog: ");
		int numLines = in.nextInt();
		
		String[] dialog = new String[numLines];
		
		for (int i = 0 ; i < dialog.length ; i++) {
			dialog[i] = in.nextLine();
		}
		
		NPC newNPC = new NPC(name, race, ..., dialog)
		
		return newNPC;		
	}
	
	
	
	
	
	
	

}
