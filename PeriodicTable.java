class PeriodicTable {

    

    public static void main(String[] elements) {
		
		String alkaliMetals[] = {"Lithium (Li)", "Sodium (Na)", "Potassium (K)", "Rubidium (Rb)", "Cesium (Cs)", "Francium (Fr)"};

		String alkalineEarthMetals[] = {"Beryllium (Be)", "Magnesium (Mg)", "Calcium (Ca)", "Strontium (Sr)", "Barium (Ba)", "Radium (Ra)"};

		String transitionMetals[] = {"Iron (Fe)", "Copper (Cu)", "Nickel (Ni)", "Zinc (Zn)", "Silver (Ag)", "Gold (Au)"};

		String postTransitionMetals[] = {"Aluminium (Al)", "Gallium (Ga)", "Indium (In)", "Tin (Sn)", "Thallium (Tl)", "Lead (Pb)"};

		String metalloids[] = {"Boron (B)", "Silicon (Si)", "Germanium (Ge)", "Arsenic (As)", "Antimony (Sb)", "Tellurium (Te)"};

		String nonMetals[] = {"Hydrogen (H)", "Carbon (C)", "Nitrogen (N)", "Oxygen (O)", "Phosphorus (P)", "Sulfur (S)"};

		String nobleGases[] = {"Helium (He)", "Neon (Ne)", "Argon (Ar)", "Krypton (Kr)", "Xenon (Xe)", "Radon (Rn)"};

		String lanthanides[] = {"Lanthanum (La)", "Cerium (Ce)", "Praseodymium (Pr)", "Neodymium (Nd)", "Samarium (Sm)", "Europium (Eu)"};

		String actinides[] = {"Actinium (Ac)", "Thorium (Th)", "Protactinium (Pa)", "Uranium (U)", "Neptunium (Np)", "Plutonium (Pu)"};

		String halogens[] = {"Fluorine (F)", "Chlorine (Cl)", "Bromine (Br)", "Iodine (I)", "Astatine (At)", "Tennessine (Ts)"};

		String syntheticElements[] = {"Technetium (Tc)", "Promethium (Pm)", "Neptunium (Np)", "Plutonium (Pu)", "Americium (Am)", "Curium (Cm)"};

		String otherMetals[] = {"Polonium (Po)", "Bismuth (Bi)", "Livermorium (Lv)", "Flerovium (Fl)", "Copernicium (Cn)", "Nihonium (Nh)"};
			
		
        System.out.println("Alkali Metals: ");		
		for(String alkaliMetal : alkaliMetals){
				System.out.println(alkaliMetal);
		}
		
		System.out.println("Alkaline Earth Metals :");
		for(String alkalineEarthMetal : alkalineEarthMetals){
				System.out.println(alkalineEarthMetal);
		}
		
		System.out.println("Transition Metals :");
		for(String transitionMetal : transitionMetals){
				System.out.println(transitionMetal);
		}
		
		System.out.println("Post Transition Metals :");
		for(String postTransitionMetal : postTransitionMetals){
				System.out.println(postTransitionMetal);
		}
		
		System.out.println("Metalloids :");
		for(String metalloid : metalloids){
				System.out.println(metalloid);
		}
		
		System.out.println("Non Metals :");
		for(String nonMetal : nonMetals){
				System.out.println(nonMetal);
		}
		
		System.out.println("Noble Gases :");
		for(String nobleGase : nobleGases){
				System.out.println(nobleGase);
		}
		
		System.out.println("Lanthanides :");
		for(String lanthanide : lanthanides){
				System.out.println(lanthanide);
		}
		
		System.out.println("Actinides :");
		for(String actinide : actinides){
				System.out.println(actinide);
		}
		
		System.out.println("Halogens :");
		for(String halogen : halogens){
				System.out.println(halogen);
		}
		
		System.out.println("Synthetic Elements :");
		for(String syntheticElement : syntheticElements){
				System.out.println(syntheticElement);
		}
		
		System.out.println("Other Metals:");
		for(String otherMetal : otherMetals){
				System.out.println(otherMetal);
		}

		

        /*System.out.println("Alkali Metals: " + alkaliMetals[0] + ", " + alkaliMetals[1] + ", " + alkaliMetals[2] + ", " + alkaliMetals[3] + ", " + alkaliMetals[4] + ", " + alkaliMetals[5]);

        System.out.println("Alkaline Earth Metals: " + alkalineEarthMetals[0] + ", " + alkalineEarthMetals[1] + ", " + alkalineEarthMetals[2] + ", " + alkalineEarthMetals[3] + ", " + alkalineEarthMetals[4] + ", " + alkalineEarthMetals[5]);

        System.out.println("Transition Metals: " + transitionMetals[0] + ", " + transitionMetals[1] + ", " + transitionMetals[2] + ", " + transitionMetals[3] + ", " + transitionMetals[4] + ", " + transitionMetals[5]);

        System.out.println("Post-transition Metals: " + postTransitionMetals[0] + ", " + postTransitionMetals[1] + ", " + postTransitionMetals[2] + ", " + postTransitionMetals[3] + ", " + postTransitionMetals[4] + ", " + postTransitionMetals[5]);

        System.out.println("Metalloids: " + metalloids[0] + ", " + metalloids[1] + ", " + metalloids[2] + ", " + metalloids[3] + ", " + metalloids[4] + ", " + metalloids[5]);

        System.out.println("Non-metals: " + nonMetals[0] + ", " + nonMetals[1] + ", " + nonMetals[2] + ", " + nonMetals[3] + ", " + nonMetals[4] + ", " + nonMetals[5]);

        System.out.println("Noble Gases: " + nobleGases[0] + ", " + nobleGases[1] + ", " + nobleGases[2] + ", " + nobleGases[3] + ", " + nobleGases[4] + ", " + nobleGases[5]);

        System.out.println("Lanthanides: " + lanthanides[0] + ", " + lanthanides[1] + ", " + lanthanides[2] + ", " + lanthanides[3] + ", " + lanthanides[4] + ", " + lanthanides[5]);

        System.out.println("Actinides: " + actinides[0] + ", " + actinides[1] + ", " + actinides[2] + ", " + actinides[3] + ", " + actinides[4] + ", " + actinides[5]);

        System.out.println("Halogens: " + halogens[0] + ", " + halogens[1] + ", " + halogens[2] + ", " + halogens[3] + ", " + halogens[4] + ", " + halogens[5]);

        System.out.println("Synthetic Elements: " + syntheticElements[0] + ", " + syntheticElements[1] + ", " + syntheticElements[2] + ", " + syntheticElements[3] + ", " + syntheticElements[4] + ", " + syntheticElements[5]);

        System.out.println("Other Metals: " + otherMetals[0] + ", " + otherMetals[1] + ", " + otherMetals[2] + ", " + otherMetals[3] + ", " + otherMetals[4] + ", " + otherMetals[5]);
    
		*/
	}
}
