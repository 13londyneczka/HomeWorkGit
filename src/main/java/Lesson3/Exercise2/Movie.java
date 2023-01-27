package Lesson3.Exercise2;
    public class Movie {
        private final String title;
        private final String directorName;
        private final String directorSurname;
        private final int movieDurationInMinutes;
        private final int yearOfProduction;

        public Movie(String title, String directorName, String directorSurname, int movieDuration, int yearOfProduction) {
            this.title = title;
            this.directorName = directorName;
            this.directorSurname = directorSurname;
            this.movieDurationInMinutes = movieDuration;
            this.yearOfProduction = yearOfProduction;
        }

        public String getTitle(){
            return title;
        }

        public String getName(){
            return directorName;
        }

        public String getSurname(){
            return directorSurname;
        }

        public int getMovieDuration(){
            return movieDurationInMinutes;
        }

        public int getYearOfProduction(){
            return yearOfProduction;
        }
    }
