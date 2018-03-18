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
			System.out.println("");
		}
		if (Sign.equals("Capricorn")) {
			System.out.println("");
		}
		if (Sign.equals("Aquarius")) {
			System.out.println("");
		}
		if (Sign.equals("Pisces")) {
			System.out.println("");
		}
	}
}
