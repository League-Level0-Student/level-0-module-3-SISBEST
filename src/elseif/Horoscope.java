package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String Sign = JOptionPane.showInputDialog(null, "What's your star sign?");
		if (Sign.equals("Aries")) {
			System.out.println("Don't listen to just one person today, no matter how close you are, you need other opinions too.No matter how much someone tries to tell you they have all the answers you need, try to keep a more open mind to other people as well. This may be someone close to you and someone you trust, but an all round perspective on things requires other voices and opinions too. You need varying advice from different people to make an informed decision.");
		}
		if (Sign.equals("Taurus")) {
			System.out.println("You won't like it when you get back what you've dished out today, but you can learn from it.You are going to have to take it on the chin today, Taurus, when you receive a dose of what you have given others recently. You arent going to like this, but you will have to accept that this is only what you deserve. The good news is, you can learn a lot from this experience and you can carry forward with you a better understanding of how things like this feel.");
		}
		if (Sign.equals("Gemini")) {
			System.out.println("When something you thought was solid starts to slip away today, know that something better is coming.Something that you thought was a certainty in your life will start to slip away from you today. Understand and trust that these things come and go for the best reasons and if this is leaving you its because something better is about to take its place. The people closest to you are a big comfort and will be there for you, and you have comfort in future plans.");
		}
		if (Sign.equals("Cancer")) {
			System.out.println("When something youve kept hidden is exposed today, take responsibility and move forward. You'll have to take responsibility today when something youve kept hidden is exposed. Whatever your reasons are for holding this secret, youll find that you feel much lighter once its out in the open. The experience will make you much stronger going forward and youll realise that this secret was never that big of a deal in the first place.");
		}
		if (Sign.equals("Leo")) {
			System.out.println("Check the information you receive from work mates and friends today before you act on it. When something is passed onto you via your work mates or personal friends today, dont just take it as fact, do your own background checking. Communication between you and those around is skewed right now, but its also vital that you straighten information out and find the truth. Dont act on anything you hear until youve checked it out for yourself.");
		}
		if (Sign.equals("Virgo")) {
			System.out.println("With high emotions today, you need to be clear with others about what you need, and with yourself. You may be a bit over sensitive today, Virgo, and your emotions will swing around wildly. For this reason you need to be very clear with those around you about how you feel and what you need, and also just as clear with yourself. Make sure you understand the self care you need to practise right now, and get in touch with the inner you for guidance.");
		}
		if (Sign.equals("Libra")) {
			System.out.println("\n" + 
					"Break free from negative people today and anyone who doesnt fit your life anymore. It's never easy to let someone go from your life, but you need to recognise when someone is either no longer a fit with your life or is actually doing you harm. You dont have room for those who bring you down and dont support you, so get tough with this today and break free from anyone who is a negative influence, you need the space for positive people.");
		}
		if (Sign.equals("Scorpio")) {
			System.out.println("Dont hesitate today, be spontaneous and do something different, your instincts will guide you. You can afford to be spontaneous today, Scorpio, it might even take you to places you never thought youd go. The one thing that will slow you down and hold you back is hesitation and indecision, so dont give these emotions room to influence you. Take a chance and do something without thinking. Your instincts will tell you whats right for you.");
		}
		if (Sign.equals("Sagittarius")) {
			System.out.println("Be honest today and accept that you may need help, its time to call in some favours owed. You are going to need to call in some favours today and you may need to bring your more adventurous side out in order to feel comfortable taking some risks. Be honest and put your cards on the table. Once everything is out in the open you can start to find solutions and move forward, but do accept that you may need help. Dont try to do everything yourself.");
		}
		if (Sign.equals("Capricorn")) {
			System.out.println("As Pluto ends its time square with Venus today, youll discover insights about behaviour. Pluto in Capricorn ends its time square with Venus today, giving you the opportunity to discover insights into the behaviour of others, and yourself. Some of this you might need to keep under your hat for now, as it could concern someone close to you, but where your own behaviour is concerned, it will give you the chance to work on your personal growth.");
		}

		if (Sign.equals("Aquarius")) {
			System.out.println("Pay attention to your responsibilities today and recognise that you are part of something bigger. Its a good day to deal with your obligations or attend to anything that you feel is your duty. This doesnt have to mean its a chore to you, your responsibilities could be connected to very positive things in your life. Recognise where your strengths are and realise that you are part of something much bigger, something that includes all those who are close to you.");
		}
		if (Sign.equals("Pisces")) {
			System.out.println("Pay attention to your responsibilities today and recognise that you are part of something bigger. It's a good day to deal with your obligations or attend to anything that you feel is your duty. This doesnt have to mean its a chore to you, your responsibilities could be connected to very positive things in your life. Recognise where your strengths are and realise that you are part of something much bigger, something that includes all those who are close to you.");
		}
	}
}
