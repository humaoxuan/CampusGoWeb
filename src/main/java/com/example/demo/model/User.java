package com.example.demo.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class User implements Serializable {

    private static final long serialVersionUID = 1527654388130L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0
    */
    private String nick_name;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String veryfication_code;

    /**
    * 
    * isNullAble:0
    */
    private String icon;

    /**
    * 
    * isNullAble:1
    */
    private String school;

    /**
    * 
    * isNullAble:1
    */
    private String academy;

    /**
    * 
    * isNullAble:1
    */
    private String grade;

    /**
    * 
    * isNullAble:1
    */
    private String uclass;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setNick_name(String nick_name){
        this.nick_name = nick_name;
    }

    public String getNick_name(){
        return this.nick_name;
    }

    public void setVeryfication_code(String veryfication_code){
        this.veryfication_code = veryfication_code;
    }

    public String getVeryfication_code(){
        return this.veryfication_code;
    }

    public void setIcon(String icon){
        this.icon = icon;
    }

    public String getIcon(){
        return this.icon;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public String getSchool(){
        return this.school;
    }

    public void setAcademy(String academy){
        this.academy = academy;
    }

    public String getAcademy(){
        return this.academy;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return this.grade;
    }

    public void setUclass(String uclass){
        this.uclass = uclass;
    }

    public String getUclass(){
        return this.uclass;
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "nick_name='" + nick_name + '\'' +
                "veryfication_code='" + veryfication_code + '\'' +
                "icon='" + icon + '\'' +
                "school='" + school + '\'' +
                "academy='" + academy + '\'' +
                "grade='" + grade + '\'' +
                "uclass='" + uclass + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends User {
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> idList;

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){
            return this.idSt;
        }

        public Integer getIdEd(){
            return this.idEd;
        }

        private List<String> nick_nameList;


        private List<String> fuzzyNick_name;

        public List<String> getFuzzyNick_name(){
            return this.fuzzyNick_name;
        }

        private List<String> rightFuzzyNick_name;

        public List<String> getRightFuzzyNick_name(){
            return this.rightFuzzyNick_name;
        }
        private List<String> veryfication_codeList;


        private List<String> fuzzyVeryfication_code;

        public List<String> getFuzzyVeryfication_code(){
            return this.fuzzyVeryfication_code;
        }

        private List<String> rightFuzzyVeryfication_code;

        public List<String> getRightFuzzyVeryfication_code(){
            return this.rightFuzzyVeryfication_code;
        }
        private List<String> iconList;


        private List<String> fuzzyIcon;

        public List<String> getFuzzyIcon(){
            return this.fuzzyIcon;
        }

        private List<String> rightFuzzyIcon;

        public List<String> getRightFuzzyIcon(){
            return this.rightFuzzyIcon;
        }
        private List<String> schoolList;


        private List<String> fuzzySchool;

        public List<String> getFuzzySchool(){
            return this.fuzzySchool;
        }

        private List<String> rightFuzzySchool;

        public List<String> getRightFuzzySchool(){
            return this.rightFuzzySchool;
        }
        private List<String> academyList;


        private List<String> fuzzyAcademy;

        public List<String> getFuzzyAcademy(){
            return this.fuzzyAcademy;
        }

        private List<String> rightFuzzyAcademy;

        public List<String> getRightFuzzyAcademy(){
            return this.rightFuzzyAcademy;
        }
        private List<String> gradeList;


        private List<String> fuzzyGrade;

        public List<String> getFuzzyGrade(){
            return this.fuzzyGrade;
        }

        private List<String> rightFuzzyGrade;

        public List<String> getRightFuzzyGrade(){
            return this.rightFuzzyGrade;
        }
        private List<String> uclassList;


        private List<String> fuzzyUclass;

        public List<String> getFuzzyUclass(){
            return this.fuzzyUclass;
        }

        private List<String> rightFuzzyUclass;

        public List<String> getRightFuzzyUclass(){
            return this.rightFuzzyUclass;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            if (id != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.idList = list;
            }

            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }



        public QueryBuilder fuzzyNick_name (List<String> fuzzyNick_name){
            this.fuzzyNick_name = fuzzyNick_name;
            return this;
        }

        public QueryBuilder fuzzyNick_name (String ... fuzzyNick_name){
            if (fuzzyNick_name != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyNick_name){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyNick_name = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyNick_name (List<String> rightFuzzyNick_name){
            this.rightFuzzyNick_name = rightFuzzyNick_name;
            return this;
        }

        public QueryBuilder rightFuzzyNick_name (String ... rightFuzzyNick_name){
            if (rightFuzzyNick_name != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyNick_name){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyNick_name = list;
            }
            return this;
        }

        public QueryBuilder nick_name(String nick_name){
            setNick_name(nick_name);
            return this;
        }

        public QueryBuilder nick_nameList(String ... nick_name){
            if (nick_name != null){
                List<String> list = new ArrayList<>();
                for (String item : nick_name){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.nick_nameList = list;
            }

            return this;
        }

        public QueryBuilder nick_nameList(List<String> nick_name){
            this.nick_nameList = nick_name;
            return this;
        }

        public QueryBuilder fetchNick_name(){
            setFetchFields("fetchFields","nick_name");
            return this;
        }

        public QueryBuilder excludeNick_name(){
            setFetchFields("excludeFields","nick_name");
            return this;
        }



        public QueryBuilder fuzzyVeryfication_code (List<String> fuzzyVeryfication_code){
            this.fuzzyVeryfication_code = fuzzyVeryfication_code;
            return this;
        }

        public QueryBuilder fuzzyVeryfication_code (String ... fuzzyVeryfication_code){
            if (fuzzyVeryfication_code != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyVeryfication_code){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyVeryfication_code = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyVeryfication_code (List<String> rightFuzzyVeryfication_code){
            this.rightFuzzyVeryfication_code = rightFuzzyVeryfication_code;
            return this;
        }

        public QueryBuilder rightFuzzyVeryfication_code (String ... rightFuzzyVeryfication_code){
            if (rightFuzzyVeryfication_code != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyVeryfication_code){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyVeryfication_code = list;
            }
            return this;
        }

        public QueryBuilder veryfication_code(String veryfication_code){
            setVeryfication_code(veryfication_code);
            return this;
        }

        public QueryBuilder veryfication_codeList(String ... veryfication_code){
            if (veryfication_code != null){
                List<String> list = new ArrayList<>();
                for (String item : veryfication_code){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.veryfication_codeList = list;
            }

            return this;
        }

        public QueryBuilder veryfication_codeList(List<String> veryfication_code){
            this.veryfication_codeList = veryfication_code;
            return this;
        }

        public QueryBuilder fetchVeryfication_code(){
            setFetchFields("fetchFields","veryfication_code");
            return this;
        }

        public QueryBuilder excludeVeryfication_code(){
            setFetchFields("excludeFields","veryfication_code");
            return this;
        }



        public QueryBuilder fuzzyIcon (List<String> fuzzyIcon){
            this.fuzzyIcon = fuzzyIcon;
            return this;
        }

        public QueryBuilder fuzzyIcon (String ... fuzzyIcon){
            if (fuzzyIcon != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyIcon){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyIcon = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyIcon (List<String> rightFuzzyIcon){
            this.rightFuzzyIcon = rightFuzzyIcon;
            return this;
        }

        public QueryBuilder rightFuzzyIcon (String ... rightFuzzyIcon){
            if (rightFuzzyIcon != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyIcon){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyIcon = list;
            }
            return this;
        }

        public QueryBuilder icon(String icon){
            setIcon(icon);
            return this;
        }

        public QueryBuilder iconList(String ... icon){
            if (icon != null){
                List<String> list = new ArrayList<>();
                for (String item : icon){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.iconList = list;
            }

            return this;
        }

        public QueryBuilder iconList(List<String> icon){
            this.iconList = icon;
            return this;
        }

        public QueryBuilder fetchIcon(){
            setFetchFields("fetchFields","icon");
            return this;
        }

        public QueryBuilder excludeIcon(){
            setFetchFields("excludeFields","icon");
            return this;
        }



        public QueryBuilder fuzzySchool (List<String> fuzzySchool){
            this.fuzzySchool = fuzzySchool;
            return this;
        }

        public QueryBuilder fuzzySchool (String ... fuzzySchool){
            if (fuzzySchool != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySchool){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySchool = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySchool (List<String> rightFuzzySchool){
            this.rightFuzzySchool = rightFuzzySchool;
            return this;
        }

        public QueryBuilder rightFuzzySchool (String ... rightFuzzySchool){
            if (rightFuzzySchool != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySchool){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySchool = list;
            }
            return this;
        }

        public QueryBuilder school(String school){
            setSchool(school);
            return this;
        }

        public QueryBuilder schoolList(String ... school){
            if (school != null){
                List<String> list = new ArrayList<>();
                for (String item : school){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.schoolList = list;
            }

            return this;
        }

        public QueryBuilder schoolList(List<String> school){
            this.schoolList = school;
            return this;
        }

        public QueryBuilder fetchSchool(){
            setFetchFields("fetchFields","school");
            return this;
        }

        public QueryBuilder excludeSchool(){
            setFetchFields("excludeFields","school");
            return this;
        }



        public QueryBuilder fuzzyAcademy (List<String> fuzzyAcademy){
            this.fuzzyAcademy = fuzzyAcademy;
            return this;
        }

        public QueryBuilder fuzzyAcademy (String ... fuzzyAcademy){
            if (fuzzyAcademy != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyAcademy){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyAcademy = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyAcademy (List<String> rightFuzzyAcademy){
            this.rightFuzzyAcademy = rightFuzzyAcademy;
            return this;
        }

        public QueryBuilder rightFuzzyAcademy (String ... rightFuzzyAcademy){
            if (rightFuzzyAcademy != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyAcademy){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyAcademy = list;
            }
            return this;
        }

        public QueryBuilder academy(String academy){
            setAcademy(academy);
            return this;
        }

        public QueryBuilder academyList(String ... academy){
            if (academy != null){
                List<String> list = new ArrayList<>();
                for (String item : academy){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.academyList = list;
            }

            return this;
        }

        public QueryBuilder academyList(List<String> academy){
            this.academyList = academy;
            return this;
        }

        public QueryBuilder fetchAcademy(){
            setFetchFields("fetchFields","academy");
            return this;
        }

        public QueryBuilder excludeAcademy(){
            setFetchFields("excludeFields","academy");
            return this;
        }



        public QueryBuilder fuzzyGrade (List<String> fuzzyGrade){
            this.fuzzyGrade = fuzzyGrade;
            return this;
        }

        public QueryBuilder fuzzyGrade (String ... fuzzyGrade){
            if (fuzzyGrade != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyGrade){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyGrade = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyGrade (List<String> rightFuzzyGrade){
            this.rightFuzzyGrade = rightFuzzyGrade;
            return this;
        }

        public QueryBuilder rightFuzzyGrade (String ... rightFuzzyGrade){
            if (rightFuzzyGrade != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyGrade){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyGrade = list;
            }
            return this;
        }

        public QueryBuilder grade(String grade){
            setGrade(grade);
            return this;
        }

        public QueryBuilder gradeList(String ... grade){
            if (grade != null){
                List<String> list = new ArrayList<>();
                for (String item : grade){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.gradeList = list;
            }

            return this;
        }

        public QueryBuilder gradeList(List<String> grade){
            this.gradeList = grade;
            return this;
        }

        public QueryBuilder fetchGrade(){
            setFetchFields("fetchFields","grade");
            return this;
        }

        public QueryBuilder excludeGrade(){
            setFetchFields("excludeFields","grade");
            return this;
        }



        public QueryBuilder fuzzyUclass (List<String> fuzzyUclass){
            this.fuzzyUclass = fuzzyUclass;
            return this;
        }

        public QueryBuilder fuzzyUclass (String ... fuzzyUclass){
            if (fuzzyUclass != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUclass){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUclass = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUclass (List<String> rightFuzzyUclass){
            this.rightFuzzyUclass = rightFuzzyUclass;
            return this;
        }

        public QueryBuilder rightFuzzyUclass (String ... rightFuzzyUclass){
            if (rightFuzzyUclass != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUclass){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUclass = list;
            }
            return this;
        }

        public QueryBuilder uclass(String uclass){
            setUclass(uclass);
            return this;
        }

        public QueryBuilder uclassList(String ... uclass){
            if (uclass != null){
                List<String> list = new ArrayList<>();
                for (String item : uclass){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.uclassList = list;
            }

            return this;
        }

        public QueryBuilder uclassList(List<String> uclass){
            this.uclassList = uclass;
            return this;
        }

        public QueryBuilder fetchUclass(){
            setFetchFields("fetchFields","uclass");
            return this;
        }

        public QueryBuilder excludeUclass(){
            setFetchFields("excludeFields","uclass");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public User build(){
            return this;
        }
    }

}
