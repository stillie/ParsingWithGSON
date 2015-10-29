package app.com.example.android.parsingwithgson;

import java.util.List;

/**
 * Created by Ryan vdW on 2015/10/26.
 */
public class Response {


    /**
     * self : http://api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?limit=10&country=us
     * alternate : http://www.rottentomatoes.com/movie/box-office/
     */

    private LinksEntity links;
    /**
     * movies : [{"id":"771380589","title":"The Martian","year":2015,"mpaa_rating":"PG-13","runtime":134,"critics_consensus":"","release_dates":{"theater":"2015-10-02"},"ratings":{"critics_rating":"Certified Fresh","critics_score":93,"audience_rating":"Upright","audience_score":93},"synopsis":"During a manned mission to Mars, Astronaut Mark Watney (Matt Damon) is presumed dead after a fierce storm and left behind by his crew. But Watney has survived and finds himself stranded and alone on the hostile planet. With only meager supplies, he must draw upon his ingenuity, wit and spirit to subsist and find a way to signal to Earth that he is alive. Millions of miles away, NASA and a team of international scientists work tirelessly to bring \"the Martian\" home, while his crewmates concurrently plot a daring, if not impossible rescue mission. As these stories of incredible bravery unfold, the world comes together to root for Watney's safe return. Based on a best-selling novel, and helmed by master director Ridley Scott, THE MARTIAN features a star studded cast that includes Jessica Chastain, Kristen Wiig, Kate Mara, Michael Pena, Jeff Daniels, Chiwetel Ejiofor, and Donald Glover. (C) Fox","posters":{"thumbnail":"http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg","profile":"http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg","detailed":"http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg","original":"http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg"},"abridged_cast":[{"name":"Matt Damon","id":"162653499","characters":["Mark Watney"]},{"name":"Jessica Chastain","id":"770760183","characters":["Melissa Lewis"]},{"name":"Kristen Wiig","id":"770670481","characters":["Annie Montrose"]},{"name":"Jeff Daniels","id":"162654392","characters":["Teddy Sanders"]},{"name":"Michael Pena","id":"309887156","characters":["Rick Martinez"]}],"alternate_ids":{"imdb":"3659388"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771380589.json","alternate":"http://www.rottentomatoes.com/m/the_martian/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/similar.json"}},{"id":"770807799","title":"Goosebumps","year":2015,"mpaa_rating":"PG","runtime":103,"critics_consensus":"","release_dates":{"theater":"2015-10-16"},"ratings":{"critics_rating":"Fresh","critics_score":73,"audience_rating":"Upright","audience_score":75},"synopsis":"Upset about moving from a big city to a small town, teenager Zach Cooper (Dylan Minnette) finds a silver lining when he meets the beautiful girl, Hannah (Odeya Rush), living right next door. But every silver lining has a cloud, and Zach's comes when he learns that Hannah has a mysterious dad who is revealed to be R. L. Stine (Jack Black), the author of the bestselling Goosebumps series. It turns out that there is a reason why Stine is so strange... he is a prisoner of his own imagination - the monsters that his books made famous are real, and Stine protects his readers by keeping them locked up in their books. When Zach unintentionally unleashes the monsters from their manuscripts and they begin to terrorize the town, it's suddenly up to Stine, Zach, and Hannah to get all of them back in the books where they belong. Note: Scholastic has sold over 400 million Goosebumps books worldwide in 32 languages since the series introduction in 1992, earning critical acclaim and dominating global best seller lists. R.L. Stine has been recognized as one of the bestselling children's authors in history. (c) Sony","posters":{"thumbnail":"http://resizing.flixster.com/s6Z8WRS8z94QTJil3axVPx3NFoM=/54x72/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/31/11193185_ori.jpg","profile":"http://resizing.flixster.com/s6Z8WRS8z94QTJil3axVPx3NFoM=/54x72/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/31/11193185_ori.jpg","detailed":"http://resizing.flixster.com/s6Z8WRS8z94QTJil3axVPx3NFoM=/54x72/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/31/11193185_ori.jpg","original":"http://resizing.flixster.com/s6Z8WRS8z94QTJil3axVPx3NFoM=/54x72/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/31/11193185_ori.jpg"},"abridged_cast":[{"name":"Jack Black","id":"162662218","characters":["R.L. Stine"]},{"name":"Dylan Minnette","id":"770808601","characters":["Zach Cooper"]},{"name":"Odeya Rush","id":"771377595","characters":["Hannah"]},{"name":"Amy Ryan","id":"162653858","characters":["Gale"]},{"name":"Jillian Bell","id":"771103724","characters":["Lorraine"]}],"alternate_ids":{"imdb":"1051904"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/770807799.json","alternate":"http://www.rottentomatoes.com/m/goosebumps_2015/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/770807799/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/770807799/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/770807799/similar.json"}},{"id":"771379326","title":"Bridge of Spies","year":2015,"mpaa_rating":"PG-13","runtime":135,"critics_consensus":"","release_dates":{"theater":"2015-10-16"},"ratings":{"critics_rating":"Certified Fresh","critics_score":92,"audience_rating":"Upright","audience_score":91},"synopsis":"Tom Hanks stars as the American attorney tasked with negotiating the release of a U-2 spy plane pilot who was shot down over Russia at the height of the Cold War in this historical drama from DreamWorks Studios. Steven Spielberg and Mark E. Platt produce a film written by Matt Charman. ~ Jason Buchanan, Rovi","posters":{"thumbnail":"http://resizing.flixster.com/E8nZbLv9ocwxiM7Ep2-QA3y8Y8A=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/14/11191456_ori.jpg","profile":"http://resizing.flixster.com/E8nZbLv9ocwxiM7Ep2-QA3y8Y8A=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/14/11191456_ori.jpg","detailed":"http://resizing.flixster.com/E8nZbLv9ocwxiM7Ep2-QA3y8Y8A=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/14/11191456_ori.jpg","original":"http://resizing.flixster.com/E8nZbLv9ocwxiM7Ep2-QA3y8Y8A=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/14/11191456_ori.jpg"},"abridged_cast":[{"name":"Tom Hanks","id":"162655641","characters":["James Donovan"]},{"name":"Mark Rylance","id":"162708436","characters":["Rudolf Abel"]},{"name":"Noah Schnapp","id":"771656761"},{"name":"John Scott Shepherd","id":"770897269","characters":["Hoffman"]},{"name":"Amy Ryan","id":"162653858","characters":["Mary"]}],"alternate_ids":{"imdb":"3682448"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771379326.json","alternate":"http://www.rottentomatoes.com/m/bridge_of_spies/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771379326/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771379326/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771379326/similar.json"}},{"id":"771385978","title":"The Last Witch Hunter","year":2015,"mpaa_rating":"PG-13","runtime":105,"critics_consensus":"","release_dates":{"theater":"2015-10-23"},"ratings":{"critics_rating":"Rotten","critics_score":14,"audience_rating":"Spilled","audience_score":54},"synopsis":"The modern world holds many secrets, but the most astounding secret of all is that witches still live amongst us; vicious supernatural creatures intent on unleashing the Black Death upon the world. Armies of witch hunters battled the unnatural enemy across the globe for centuries, including KAULDER, a valiant warrior who managed to slay the all-powerful QUEEN WITCH, decimating her followers in the process. In the moments right before her death, the QUEEN curses KAULDER with her own immortality, forever separating him from his beloved wife and daughter in the afterlife. Today KAULDER is the only one of his kind remaining, and has spent centuries hunting down rogue witches, all the while yearning for his long-lost loved ones. However, unbeknownst to KAULDER, the QUEEN WITCH is resurrected and seeks revenge on her killer causing an epic battle that will determine the survival of the human race. (C) Summit","posters":{"thumbnail":"http://resizing.flixster.com/6fWtO-VKnCprVBaWS_CiR6VxS3c=/53x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/33/11203315_ori.jpg","profile":"http://resizing.flixster.com/6fWtO-VKnCprVBaWS_CiR6VxS3c=/53x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/33/11203315_ori.jpg","detailed":"http://resizing.flixster.com/6fWtO-VKnCprVBaWS_CiR6VxS3c=/53x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/33/11203315_ori.jpg","original":"http://resizing.flixster.com/6fWtO-VKnCprVBaWS_CiR6VxS3c=/53x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/33/11203315_ori.jpg"},"abridged_cast":[{"name":"Vin Diesel","id":"162652472","characters":["Kaulder"]},{"name":"Elijah Wood","id":"162652512","characters":["Dolan 37th"]},{"name":"Rose Leslie","id":"771365481","characters":["Chloe"]},{"name":"Michael Caine","id":"162652646","characters":["Dolan 36th"]},{"name":"Olafur Darri Olafsson","id":"623770119","characters":["Belial"]}],"alternate_ids":{"imdb":"1618442"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385978.json","alternate":"http://www.rottentomatoes.com/m/the_last_witch_hunter/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385978/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385978/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385978/similar.json"}},{"id":"771321495","title":"Hotel Transylvania 2","year":2015,"mpaa_rating":"PG","runtime":89,"critics_consensus":"","release_dates":{"theater":"2015-09-25"},"ratings":{"critics_rating":"Rotten","critics_score":51,"audience_rating":"Upright","audience_score":72},"synopsis":"The hit CG-animated family comedy Hotel Transylvania gets a follow-up with this Sony Pictures Animation production.","posters":{"thumbnail":"http://resizing.flixster.com/n_uO9xcTc6ZQWIkF5LbNfC1P4EA=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/15/11191564_ori.jpg","profile":"http://resizing.flixster.com/n_uO9xcTc6ZQWIkF5LbNfC1P4EA=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/15/11191564_ori.jpg","detailed":"http://resizing.flixster.com/n_uO9xcTc6ZQWIkF5LbNfC1P4EA=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/15/11191564_ori.jpg","original":"http://resizing.flixster.com/n_uO9xcTc6ZQWIkF5LbNfC1P4EA=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/15/11191564_ori.jpg"},"abridged_cast":[{"name":"Selena Gomez","id":"770686131","characters":["Mavis"]},{"name":"Mel Brooks","id":"162658738","characters":["Vlad"]},{"name":"Kevin James","id":"326298578","characters":["Frankenstein"]},{"name":"Steve Buscemi","id":"162652875","characters":["Wayne"]},{"name":"Andy Samberg","id":"602828424","characters":["Jonathan"]}],"alternate_ids":{"imdb":"2510894"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771321495.json","alternate":"http://www.rottentomatoes.com/m/hotel_transylvania_2/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771321495/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771321495/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771321495/similar.json"}},{"id":"771390919","title":"Paranormal Activity: The Ghost Dimension","year":2015,"mpaa_rating":"R","runtime":84,"critics_consensus":"","release_dates":{"theater":"2015-10-23"},"ratings":{"critics_rating":"Rotten","critics_score":15,"audience_rating":"Spilled","audience_score":40},"synopsis":"The Paranormal Activity series grows with this fifth entry from Paramount Pictures. ~ Jeremy Wheeler, Rovi","posters":{"thumbnail":"http://resizing.flixster.com/Y0KyVVVwn_FTMfySvePDxIJ_NY0=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/33/11203324_ori.jpg","profile":"http://resizing.flixster.com/Y0KyVVVwn_FTMfySvePDxIJ_NY0=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/33/11203324_ori.jpg","detailed":"http://resizing.flixster.com/Y0KyVVVwn_FTMfySvePDxIJ_NY0=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/33/11203324_ori.jpg","original":"http://resizing.flixster.com/Y0KyVVVwn_FTMfySvePDxIJ_NY0=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/33/11203324_ori.jpg"},"abridged_cast":[{"name":"Chris Murray","id":"771080103","characters":["Ryan"]},{"name":"Chris J. Miller","id":"771754724","characters":["Ryan"]},{"name":"Brit Shaw","id":"771466765","characters":["Emily"]},{"name":"Ivy George","id":"771489449","characters":["Leila"]},{"name":"Brittany Shaw","id":"771086634","characters":["Emily"]}],"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771390919.json","alternate":"http://www.rottentomatoes.com/m/paranormal_activity_the_ghost_dimension/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771390919/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771390919/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771390919/similar.json"}},{"id":"771413488","title":"Steve Jobs","year":2015,"mpaa_rating":"R","runtime":122,"critics_consensus":"","release_dates":{"theater":"2015-10-23"},"ratings":{"critics_rating":"Certified Fresh","critics_score":85,"audience_rating":"Upright","audience_score":79},"synopsis":"Set backstage at three iconic product launches and ending in 1998 with the unveiling of the iMac, Steve Jobs takes us behind the scenes of the digital revolution to paint an intimate portrait of the brilliant man at its epicenter.-- (C) Universal","posters":{"thumbnail":"http://resizing.flixster.com/kt0oaon2QKNC82amLuay-ulCMUU=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/16/11201611_ori.jpg","profile":"http://resizing.flixster.com/kt0oaon2QKNC82amLuay-ulCMUU=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/16/11201611_ori.jpg","detailed":"http://resizing.flixster.com/kt0oaon2QKNC82amLuay-ulCMUU=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/16/11201611_ori.jpg","original":"http://resizing.flixster.com/kt0oaon2QKNC82amLuay-ulCMUU=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/16/11201611_ori.jpg"},"abridged_cast":[{"name":"Michael Fassbender","id":"364641814","characters":["Steve Jobs"]},{"name":"Seth Rogen","id":"162653310","characters":["Steven Wozniak"]},{"name":"Katherine Waterston","id":"770685715","characters":["Chrisann Brennan"]},{"name":"Kate Winslet","id":"162659302","characters":["Joanna Hoffman"]},{"name":"Sarah Snook","id":"771102518","characters":["Andrea Cunningham"]}],"alternate_ids":{"imdb":"2080374"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771413488.json","alternate":"http://www.rottentomatoes.com/m/steve_jobs_2015/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771413488/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771413488/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771413488/similar.json"}},{"id":"771323056","title":"Crimson Peak","year":2015,"mpaa_rating":"R","runtime":119,"critics_consensus":"","release_dates":{"theater":"2015-10-16"},"ratings":{"critics_rating":"Fresh","critics_score":68,"audience_rating":"Upright","audience_score":63},"synopsis":"When her heart is stolen by a seductive stranger, a young woman is swept away to a house atop a mountain of blood-red clay: a place &#64257;lled with secrets that will haunt her forever. Between desire and darkness, between mystery and madness, lies the truth behind Crimson Peak. From the imagination of director Guillermo del Toro comes a supernatural mystery starring Tom Hiddleston, Jessica Chastain, Mia Wasikowska and Charlie Hunnam (C) Universal","posters":{"thumbnail":"http://resizing.flixster.com/fSNka_5_2sa0yRMVNj8viQdUFJs=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/00/11190023_ori.jpg","profile":"http://resizing.flixster.com/fSNka_5_2sa0yRMVNj8viQdUFJs=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/00/11190023_ori.jpg","detailed":"http://resizing.flixster.com/fSNka_5_2sa0yRMVNj8viQdUFJs=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/00/11190023_ori.jpg","original":"http://resizing.flixster.com/fSNka_5_2sa0yRMVNj8viQdUFJs=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/00/11190023_ori.jpg"},"abridged_cast":[{"name":"Charlie Hunnam","id":"162653833"},{"name":"Jessica Chastain","id":"770760183"},{"name":"Mia Wasikowska","id":"770688391"},{"name":"Tom Hiddleston","id":"770837993"},{"name":"Jim Beaver","id":"770682941","characters":["Carter Cushing"]}],"alternate_ids":{"imdb":"2554274"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771323056.json","alternate":"http://www.rottentomatoes.com/m/crimson_peak/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771323056/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771323056/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771323056/similar.json"}},{"id":"771370466","title":"The Intern","year":2015,"mpaa_rating":"PG-13","runtime":121,"critics_consensus":"","release_dates":{"theater":"2015-09-25"},"ratings":{"critics_rating":"Rotten","critics_score":59,"audience_rating":"Upright","audience_score":79},"synopsis":"A retired successful business owner and widower lands an internship at a fashion website run by a young, career-driven woman. ~ Jason Buchanan, Rovi","posters":{"thumbnail":"http://resizing.flixster.com/bvk3HvDiheSeXEVmSqZamTnuMs4=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/20/11202098_ori.jpg","profile":"http://resizing.flixster.com/bvk3HvDiheSeXEVmSqZamTnuMs4=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/20/11202098_ori.jpg","detailed":"http://resizing.flixster.com/bvk3HvDiheSeXEVmSqZamTnuMs4=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/20/11202098_ori.jpg","original":"http://resizing.flixster.com/bvk3HvDiheSeXEVmSqZamTnuMs4=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/20/11202098_ori.jpg"},"abridged_cast":[{"name":"Anne Hathaway","id":"162656190","characters":["Jules Ostin"]},{"name":"Robert De Niro","id":"162655521","characters":["Ben Whittaker"]},{"name":"Rene Russo","id":"162654462","characters":["Fiona"]},{"name":"Adam DeVine","id":"771395925","characters":["Jason"]},{"name":"Andrew Rannells","id":"770812771","characters":["Cameron"]}],"alternate_ids":{"imdb":"2361509"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370466.json","alternate":"http://www.rottentomatoes.com/m/the_intern/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370466/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370466/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370466/similar.json"}},{"id":"771414183","title":"Sicario","year":2015,"mpaa_rating":"R","runtime":120,"critics_consensus":"","release_dates":{"theater":"2015-10-02"},"ratings":{"critics_rating":"Certified Fresh","critics_score":93,"audience_rating":"Upright","audience_score":88},"synopsis":"In the lawless border area stretching between the U.S. and Mexico, an idealistic FBI agent [Emily Blunt] is enlisted by an elite government task force official [Josh Brolin] to aid in the escalating war against drugs. Led by an enigmatic consultant with a questionable past [Benicio Del Toro], the team sets out on a clandestine journey forcing Kate to question everything that she believes in order to survive. (C) Lionsgate","posters":{"thumbnail":"http://resizing.flixster.com/rnBW0_TPz88kOyzzhs5HJe3zPjo=/54x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/22/11202243_ori.jpg","profile":"http://resizing.flixster.com/rnBW0_TPz88kOyzzhs5HJe3zPjo=/54x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/22/11202243_ori.jpg","detailed":"http://resizing.flixster.com/rnBW0_TPz88kOyzzhs5HJe3zPjo=/54x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/22/11202243_ori.jpg","original":"http://resizing.flixster.com/rnBW0_TPz88kOyzzhs5HJe3zPjo=/54x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/22/11202243_ori.jpg"},"abridged_cast":[{"name":"Emily Blunt","id":"162685827","characters":["Kate Macy"]},{"name":"Jon Bernthal","id":"770682766","characters":["Ted"]},{"name":"Josh Brolin","id":"162654237","characters":["Matt"]},{"name":"Benicio Del Toro","id":"162652510","characters":["Alejandro"]},{"name":"Jeffrey Donovan","id":"162722191","characters":["Steve Forsing"]}],"alternate_ids":{"imdb":"3397884"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771414183.json","alternate":"http://www.rottentomatoes.com/m/sicario_2015/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771414183/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771414183/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771414183/similar.json"}}]
     * links : {"self":"http://api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?limit=10&country=us","alternate":"http://www.rottentomatoes.com/movie/box-office/"}
     * link_template : http://api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?limit={num-results}&country={country-code}
     */

    private String link_template;
    /**
     * id : 771380589
     * title : The Martian
     * year : 2015
     * mpaa_rating : PG-13
     * runtime : 134
     * critics_consensus :
     * release_dates : {"theater":"2015-10-02"}
     * ratings : {"critics_rating":"Certified Fresh","critics_score":93,"audience_rating":"Upright","audience_score":93}
     * synopsis : During a manned mission to Mars, Astronaut Mark Watney (Matt Damon) is presumed dead after a fierce storm and left behind by his crew. But Watney has survived and finds himself stranded and alone on the hostile planet. With only meager supplies, he must draw upon his ingenuity, wit and spirit to subsist and find a way to signal to Earth that he is alive. Millions of miles away, NASA and a team of international scientists work tirelessly to bring "the Martian" home, while his crewmates concurrently plot a daring, if not impossible rescue mission. As these stories of incredible bravery unfold, the world comes together to root for Watney's safe return. Based on a best-selling novel, and helmed by master director Ridley Scott, THE MARTIAN features a star studded cast that includes Jessica Chastain, Kristen Wiig, Kate Mara, Michael Pena, Jeff Daniels, Chiwetel Ejiofor, and Donald Glover. (C) Fox
     * posters : {"thumbnail":"http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg","profile":"http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg","detailed":"http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg","original":"http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg"}
     * abridged_cast : [{"name":"Matt Damon","id":"162653499","characters":["Mark Watney"]},{"name":"Jessica Chastain","id":"770760183","characters":["Melissa Lewis"]},{"name":"Kristen Wiig","id":"770670481","characters":["Annie Montrose"]},{"name":"Jeff Daniels","id":"162654392","characters":["Teddy Sanders"]},{"name":"Michael Pena","id":"309887156","characters":["Rick Martinez"]}]
     * alternate_ids : {"imdb":"3659388"}
     * links : {"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771380589.json","alternate":"http://www.rottentomatoes.com/m/the_martian/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/similar.json"}
     */

    private List<MoviesEntity> movies;

    public void setLinks(LinksEntity links) {
        this.links = links;
    }

    public void setLink_template(String link_template) {
        this.link_template = link_template;
    }

    public void setMovies(List<MoviesEntity> movies) {
        this.movies = movies;
    }

    public LinksEntity getLinks() {
        return links;
    }

    public String getLink_template() {
        return link_template;
    }

    public List<MoviesEntity> getMovies() {
        return movies;
    }

    public static class LinksEntity {
        private String self;
        private String alternate;

        public void setSelf(String self) {
            this.self = self;
        }

        public void setAlternate(String alternate) {
            this.alternate = alternate;
        }

        public String getSelf() {
            return self;
        }

        public String getAlternate() {
            return alternate;
        }
    }

    public static class MoviesEntity {
        private String id;
        private String title;
        private int year;
        private String mpaa_rating;
        private int runtime;
        private String critics_consensus;
        /**
         * theater : 2015-10-02
         */

        private ReleaseDatesEntity release_dates;
        /**
         * critics_rating : Certified Fresh
         * critics_score : 93
         * audience_rating : Upright
         * audience_score : 93
         */

        private RatingsEntity ratings;
        private String synopsis;
        /**
         * thumbnail : http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg
         * profile : http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg
         * detailed : http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg
         * original : http://resizing.flixster.com/w1m455J_AaUzi_Aaca2vpL2VymI=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/20/23/11202355_ori.jpg
         */

        private PostersEntity posters;
        /**
         * imdb : 3659388
         */

        private AlternateIdsEntity alternate_ids;
        /**
         * self : http://api.rottentomatoes.com/api/public/v1.0/movies/771380589.json
         * alternate : http://www.rottentomatoes.com/m/the_martian/
         * cast : http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/cast.json
         * reviews : http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/reviews.json
         * similar : http://api.rottentomatoes.com/api/public/v1.0/movies/771380589/similar.json
         */

        private LinksEntity links;
        /**
         * name : Matt Damon
         * id : 162653499
         * characters : ["Mark Watney"]
         */

        private List<AbridgedCastEntity> abridged_cast;

        public void setId(String id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setMpaa_rating(String mpaa_rating) {
            this.mpaa_rating = mpaa_rating;
        }

        public void setRuntime(int runtime) {
            this.runtime = runtime;
        }

        public void setCritics_consensus(String critics_consensus) {
            this.critics_consensus = critics_consensus;
        }

        public void setRelease_dates(ReleaseDatesEntity release_dates) {
            this.release_dates = release_dates;
        }

        public void setRatings(RatingsEntity ratings) {
            this.ratings = ratings;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public void setPosters(PostersEntity posters) {
            this.posters = posters;
        }

        public void setAlternate_ids(AlternateIdsEntity alternate_ids) {
            this.alternate_ids = alternate_ids;
        }

        public void setLinks(LinksEntity links) {
            this.links = links;
        }

        public void setAbridged_cast(List<AbridgedCastEntity> abridged_cast) {
            this.abridged_cast = abridged_cast;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public String getMpaa_rating() {
            return mpaa_rating;
        }

        public int getRuntime() {
            return runtime;
        }

        public String getCritics_consensus() {
            return critics_consensus;
        }

        public ReleaseDatesEntity getRelease_dates() {
            return release_dates;
        }

        public RatingsEntity getRatings() {
            return ratings;
        }

        public String getSynopsis() {
            return synopsis;
        }

        public PostersEntity getPosters() {
            return posters;
        }

        public AlternateIdsEntity getAlternate_ids() {
            return alternate_ids;
        }

        public LinksEntity getLinks() {
            return links;
        }

        public List<AbridgedCastEntity> getAbridged_cast() {
            return abridged_cast;
        }

        public static class ReleaseDatesEntity {
            private String theater;

            public void setTheater(String theater) {
                this.theater = theater;
            }

            public String getTheater() {
                return theater;
            }
        }

        public static class RatingsEntity {
            private String critics_rating;
            private int critics_score;
            private String audience_rating;
            private int audience_score;

            public void setCritics_rating(String critics_rating) {
                this.critics_rating = critics_rating;
            }

            public void setCritics_score(int critics_score) {
                this.critics_score = critics_score;
            }

            public void setAudience_rating(String audience_rating) {
                this.audience_rating = audience_rating;
            }

            public void setAudience_score(int audience_score) {
                this.audience_score = audience_score;
            }

            public String getCritics_rating() {
                return critics_rating;
            }

            public int getCritics_score() {
                return critics_score;
            }

            public String getAudience_rating() {
                return audience_rating;
            }

            public int getAudience_score() {
                return audience_score;
            }
        }

        public static class PostersEntity {
            private String thumbnail;
            private String profile;
            private String detailed;
            private String original;

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public void setProfile(String profile) {
                this.profile = profile;
            }

            public void setDetailed(String detailed) {
                this.detailed = detailed;
            }

            public void setOriginal(String original) {
                this.original = original;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public String getProfile() {
                return profile;
            }

            public String getDetailed() {
                return detailed;
            }

            public String getOriginal() {
                return original;
            }
        }

        public static class AlternateIdsEntity {
            private String imdb;

            public void setImdb(String imdb) {
                this.imdb = imdb;
            }

            public String getImdb() {
                return imdb;
            }
        }

        public static class LinksEntity {
            private String self;
            private String alternate;
            private String cast;
            private String reviews;
            private String similar;

            public void setSelf(String self) {
                this.self = self;
            }

            public void setAlternate(String alternate) {
                this.alternate = alternate;
            }

            public void setCast(String cast) {
                this.cast = cast;
            }

            public void setReviews(String reviews) {
                this.reviews = reviews;
            }

            public void setSimilar(String similar) {
                this.similar = similar;
            }

            public String getSelf() {
                return self;
            }

            public String getAlternate() {
                return alternate;
            }

            public String getCast() {
                return cast;
            }

            public String getReviews() {
                return reviews;
            }

            public String getSimilar() {
                return similar;
            }
        }

        public static class AbridgedCastEntity {
            private String name;
            private String id;
            private List<String> characters;

            public void setName(String name) {
                this.name = name;
            }

            public void setId(String id) {
                this.id = id;
            }

            public void setCharacters(List<String> characters) {
                this.characters = characters;
            }

            public String getName() {
                return name;
            }

            public String getId() {
                return id;
            }

            public List<String> getCharacters() {
                return characters;
            }
        }
    }
}
