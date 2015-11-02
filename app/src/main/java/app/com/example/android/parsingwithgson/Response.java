package app.com.example.android.parsingwithgson;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Ryan vdW on 2015/10/26.
 */
public class Response implements Parcelable{

    private LinksEntity links;


    private String link_template;

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

    @Override
    public int describeContents() {

        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {

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
