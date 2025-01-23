package filmarkiv.klient;

import filmarkiv.impl.Film;
import filmarkiv.impl.Sjanger;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	public Meny(FilmarkivADT filmarkiv){
	tekstgr = new Tekstgrensesnitt();
	this.filmarkiv = filmarkiv;
	}
	public void start(){
		
	// TODO
		Film f1 = new Film(1, "henry karlsen", "the beggining", Sjanger.ACTION, 1998, "mats as");
		Film f2 = new Film(1, "kanada ken", "kanada ken begins coming back from space 3", Sjanger.ROMANCE, 20, "bacon snørjansen as");
		Film f3 = new Film(1, "justin bieber", "beggining of the believers", Sjanger.HORROR, 2021, "t-dawg");	
		Film f4 = new Film(1, "bandanaman", "bandanabanana begins", Sjanger.ACTION, 2021, "t-bone");
		Film f5 = new Film(1, "bananaman", "banana beginning?", Sjanger.COMEDY, 2006, "bandanabanana as");
		Film f6 = new Film(1, "gorilla glen", "the beginning of the gorillas", Sjanger.ACTION, 2032, "kolo");
		Film f7 = new Film(1, "monkeypawpatroll", "the paw begins", Sjanger.COMEDY, 2011, "politi-vest");
		Film f8 = new Film(1, "henry karlsen", "the beggining", Sjanger.ACTION, 1998, "mats as");
		Film f9 = new Film(9, "starfield stan", "the galactic conquest", Sjanger.COMEDY, 2042, "space studios");
        Film f10 = new Film(10, "luna love", "romance under the moon", Sjanger.ROMANCE, 2015, "lunar pictures");
        Film f11 = new Film(11, "horror henry", "the haunted mansion", Sjanger.HORROR, 1999, "scare factory");
        Film f12 = new Film(12, "captain banana", "pirates of the fruit sea", Sjanger.COMEDY, 2010, "fruit punch productions");
        Film f13 = new Film(13, "stealth shadow", "the spy who vanished", Sjanger.ACTION, 2005, "cloak and dagger films");
        Film f14 = new Film(14, "cosmic carl", "adventures in the milky way", Sjanger.SCIFI, 2028, "starlight entertainment");
        Film f15 = new Film(15, "daring diana", "queen of the jungle", Sjanger.ACTION, 2017, "adventure tales inc.");
        Film f16 = new Film(16, "giggle gang", "laughing all the way", Sjanger.COMEDY, 2023, "funny bone studios");
        Film f17 = new Film(17, "romantic rachel", "forever and always", Sjanger.ROMANCE, 1993, "heartfelt productions");
        Film f18 = new Film(18, "phantom phil", "the ghostly rider", Sjanger.HORROR, 1984, "midnight terrors");
        Film f19 = new Film(19, "adventure alex", "journey to the lost city", Sjanger.ACTION, 2008, "explorer studios");
        Film f20 = new Film(20, "venus valerie", "love on mars", Sjanger.ROMANCE, 2025, "cosmic love films");
        Film f21 = new Film(21, "midnight mike", "the clock strikes horror", Sjanger.HORROR, 2001, "dark hour productions");
        Film f22 = new Film(22, "silly sam", "a day at the circus", Sjanger.COMEDY, 1995, "big top pictures");
        Film f23 = new Film(23, "galactic greg", "space rangers unite", Sjanger.SCIFI, 2035, "stellar adventures");
        Film f24 = new Film(24, "brave bella", "queen of the mountains", Sjanger.ACTION, 2018, "trailblazer studios");
        Film f25 = new Film(25, "laughing larry", "the stand-up chronicles", Sjanger.COMEDY, 2020, "punchline productions");
        Film f26 = new Film(26, "fearful fiona", "haunting whispers", Sjanger.HORROR, 1987, "phantom films");
        Film f27 = new Film(27, "romantic ryan", "the secret admirer", Sjanger.ROMANCE, 1990, "eternal flame pictures");
        Film f28 = new Film(28, "cyber charlie", "rise of the machines", Sjanger.SCIFI, 2045, "techno tales");
        Film f29 = new Film(29, "jungle jim", "escape from the wild", Sjanger.ACTION, 2012, "safari studios");
        Film f30 = new Film(30, "venus victoria", "heartbeats in the cosmos", Sjanger.ROMANCE, 2022, "interstellar love inc.");
        Film f31 = new Film(31, "shadowy sean", "night of the shadows", Sjanger.HORROR, 2004, "eerie productions");
        Film f32 = new Film(32, "hilarious harry", "clowning around", Sjanger.COMEDY, 1998, "fun factory");
        Film f33 = new Film(33, "astro amy", "mission to the stars", Sjanger.SCIFI, 2030, "orbit studios");
        Film f34 = new Film(34, "daring david", "guardian of the realm", Sjanger.ACTION, 2016, "epic tales");
        Film f35 = new Film(35, "jovial jack", "the prankster's revenge", Sjanger.COMEDY, 2023, "laughline productions");
        Film f36 = new Film(36, "spooky steve", "the cursed diary", Sjanger.HORROR, 1992, "ghostlight studios");
        Film f37 = new Film(37, "tender tina", "a love to remember", Sjanger.ROMANCE, 1985, "heartstring productions");
        Film f38 = new Film(38, "mech max", "battle for the future", Sjanger.SCIFI, 2050, "future frontlines");


	}
}
