class Library {

   

    public static void main(String[] books) {

		String fictionBooks[] = {"To Kill a Mockingbird", "1984", "The Great Gatsby", "The Catcher in the Rye","Pride and Prejudice", "The Alchemist", "The Book Thief", "The Kite Runner"};

		String nonFictionBooks[] = {"Sapiens", "Educated", "The Wright Brothers", "Becoming", "The Power of Habit", "Born a Crime", "Thinking, Fast and Slow", "Into the Wild"};

		String scienceBooks[] = {"A Brief History of Time", "The Selfish Gene", "Cosmos", "The Elegant Universe","The Gene", "Astrophysics for People in a Hurry", "Physics of the Impossible", "The Body"};
    
		String historyBooks[] = {"Guns, Germs, and Steel", "The Diary of Anne Frank", "Team of Rivals", "The Silk Roads","1776", "The History of the Ancient World", "A People's History of the United States", "India After Gandhi"};

		String mysteryBooks[] = {"Gone Girl", "The Girl with the Dragon Tattoo", "Sherlock Holmes", "The Da Vinci Code","And Then There Were None", "In the Woods", "Big Little Lies", "The Woman in White"};

		String fantasyBooks[] = {"Harry Potter and the Sorcerer's Stone", "The Hobbit", "The Lord of the Rings", "A Game of Thrones","Eragon", "The Name of the Wind", "Percy Jackson", "Mistborn"};

		String childrenBooks[] = {"Charlotte's Web", "The Very Hungry Caterpillar", "Matilda", "The Cat in the Hat","Winnie-the-Pooh", "Diary of a Wimpy Kid", "Where the Wild Things Are", "The Gruffalo"};

		String selfHelpBooks[] = {"The 7 Habits of Highly Effective People", "How to Win Friends and Influence People", "Atomic Habits", "The Subtle Art of Not Giving a F*ck","Think and Grow Rich", "You Can Win", "The Magic of Thinking Big", "Rich Dad Poor Dad"};
	
		
		System.out.println("Fiction Books: " );
		for(String fictionBook : fictionBooks){
				System.out.println(fictionBook);
		}
		
		System.out.println("NonFiction Books :");
		for(String nonFictionBook : nonFictionBooks){
				System.out.println(nonFictionBook);
		}
		
		System.out.println("Science Books :");
		for(String scienceBook : scienceBooks){
				System.out.println(scienceBook);
		}
		
		System.out.println("History Books :");
		for(String historyBook : historyBooks){
				System.out.println(historyBook);
		}
		
		System.out.println("Mystery Books :");
		for(String mysteryBook : mysteryBooks){
				System.out.println(mysteryBook);
		}
		
		System.out.println("Fantasy Books :");
		for(String fantasyBook : fantasyBooks){
				System.out.println(fantasyBook);
		}
		
		System.out.println("Children Books :");
		for(String childrenBook : childrenBooks){
				System.out.println(childrenBook);
		}
		
		System.out.println("SelfHelp Books:");
		for(String selfHelpBook : selfHelpBooks){
				System.out.println(selfHelpBook);
		}
		
		

        /*System.out.println("Fiction Books: " + fictionBooks[0] + ", " + fictionBooks[1] + ", " + fictionBooks[2] + ", " + fictionBooks[3] + ", " + fictionBooks[4] + ", " + fictionBooks[5] + ", " + fictionBooks[6] + ", " + fictionBooks[7]);

        System.out.println("Non-Fiction Books: " + nonFictionBooks[0] + ", " + nonFictionBooks[1] + ", " + nonFictionBooks[2] + ", " + nonFictionBooks[3] + ", " + nonFictionBooks[4] + ", " + nonFictionBooks[5] + ", " + nonFictionBooks[6] + ", " + nonFictionBooks[7]);

        System.out.println("Science Books: " + scienceBooks[0] + ", " + scienceBooks[1] + ", " + scienceBooks[2] + ", " + scienceBooks[3] + ", " + scienceBooks[4] + ", " + scienceBooks[5] + ", " + scienceBooks[6] + ", " + scienceBooks[7]);

        System.out.println("History Books: " + historyBooks[0] + ", " + historyBooks[1] + ", " + historyBooks[2] + ", " + historyBooks[3] + ", " + historyBooks[4] + ", " + historyBooks[5] + ", " + historyBooks[6] + ", " + historyBooks[7]);

        System.out.println("Mystery Books: " + mysteryBooks[0] + ", " + mysteryBooks[1] + ", " + mysteryBooks[2] + ", " + mysteryBooks[3] + ", " + mysteryBooks[4] + ", " + mysteryBooks[5] + ", " + mysteryBooks[6] + ", " + mysteryBooks[7]);

        System.out.println("Fantasy Books: " + fantasyBooks[0] + ", " + fantasyBooks[1] + ", " + fantasyBooks[2] + ", " + fantasyBooks[3] + ", " + fantasyBooks[4] + ", " + fantasyBooks[5] + ", " + fantasyBooks[6] + ", " + fantasyBooks[7]);

        System.out.println("Children Books: " + childrenBooks[0] + ", " + childrenBooks[1] + ", " + childrenBooks[2] + ", " + childrenBooks[3] + ", " + childrenBooks[4] + ", " + childrenBooks[5] + ", " + childrenBooks[6] + ", " + childrenBooks[7]);

        System.out.println("Self-Help Books: " + selfHelpBooks[0] + ", " + selfHelpBooks[1] + ", " + selfHelpBooks[2] + ", " + selfHelpBooks[3] + ", " + selfHelpBooks[4] + ", " + selfHelpBooks[5] + ", " + selfHelpBooks[6] + ", " + selfHelpBooks[7]);
		*/
	}
}
