(ns clarice.db)

(def default-db
  {:brand-first-part  "clarice"
   :brand-second-part "bouwer"
   :navigation        [{:react       "0"
                        :title       "Welcome"
                        :description "Welcome to a showcase of my career"
                        :class       "welcome"
                        :icon        "fas fa-comment-dots"
                        :href        "/#/"
                        :panel       :welcome-panel}

                       {:react       "1"
                        :title       "About"
                        :description "Find out more about me"
                        :class       "about"
                        :icon        "fas fa-user"
                        :href        "/#/about"
                        :panel       :about-panel}

                       {:react       "2"
                        :title       "Career"
                        :description "Growth in my profession as a Software developer"
                        :class       "career"
                        :icon        "fas fa-laptop-code"
                        :href        "/#/career"
                        :panel       :career-panel}

                       {:react       "3"
                        :title       "Showcase"
                        :description "A broad outlook of my career"
                        :class       "showcase"
                        :icon        "fas fa-trophy"
                        :href        "/#/showcase"
                        :panel       :showcase-panel

                        :items       [{:react       "4"
                                       :title       "Technologies"
                                       :description "Technologies I've been exposed to"
                                       :class       "technologies"
                                       :icon        "fas fa-terminal"
                                       :href        "/#/technologies"
                                       :panel       :technologies-panel}

                                      {:react       "5"
                                       :title       "Qualifications"
                                       :description "My qualifications as a Software Developer"
                                       :class       "qualifications"
                                       :icon        "fas fa-graduation-cap"
                                       :href        "/#/qualifications"
                                       :panel       :qualifications-panel}

                                      {:react       "6"
                                       :title       "Podcasts"
                                       :description "Podcasts I have aired on"
                                       :class       "podcasts"
                                       :icon        "fas fa-microphone-alt"
                                       :href        "/#/podcasts"
                                       :panel       :podcasts-panel}

                                      {:react       "7"
                                       :title       "Publishing"
                                       :description "Work I have had published"
                                       :class       "publishing"
                                       :icon        "fas fa-book"
                                       :href        "/#/publishing"
                                       :panel       :publishing-panel}

                                      {:react       "8"
                                       :title       "Public Speaking"
                                       :description "My involvement in public speaking"
                                       :class       "public-speaking"
                                       :icon        "fas fa-volume-up"
                                       :href        "/#/public-speaking"
                                       :panel       :public-speaking-panel}

                                      {:react       "9"
                                       :title       "Blogs"
                                       :description "My blogs I have created"
                                       :class       "blogs"
                                       :icon        "fas fa-blog"
                                       :href        "/#/blogs"
                                       :panel       :blogs-panel}

                                      {:react       "10"
                                       :title       "Projects"
                                       :description "Projects I have had the honor to work on"
                                       :class       "projects"
                                       :icon        "fas fa-code-branch"
                                       :href        "/#/projects"
                                       :panel       :projects-panel}

                                      {:react       "11"
                                       :title       "Community"
                                       :description "My involvement in the community"
                                       :class       "community"
                                       :icon        "fas fa-users"
                                       :href        "/#/community"
                                       :panel       :community-panel}]}

                       {:react       "12"
                        :title       "Contact"
                        :description "Get in touch with me"
                        :class       "contact"
                        :icon        "fas fa-id-card"
                        :href        "/#/contact"
                        :panel       :contact-panel}

                       {:react       "13"
                        :title       "Resume"
                        :description "Complete resume"
                        :class       "resume"
                        :icon        "fas fa-file"
                        :href        "/#/resume"
                        :panel       :resume-panel}]})
