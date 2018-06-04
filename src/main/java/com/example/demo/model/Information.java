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
public class Information implements Serializable {

    private static final long serialVersionUID = 1527940876980L;


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
    private String content;

    /**
    * 
    * isNullAble:1
    */
    private String type;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime time;

    /**
    * 
    * isNullAble:0
    */
    private Integer user_id;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setTime(java.time.LocalDateTime time){
        this.time = time;
    }

    public java.time.LocalDateTime getTime(){
        return this.time;
    }

    public void setUser_id(Integer user_id){
        this.user_id = user_id;
    }

    public Integer getUser_id(){
        return this.user_id;
    }
    @Override
    public String toString() {
        return "Information{" +
                "id='" + id + '\'' +
                "content='" + content + '\'' +
                "type='" + type + '\'' +
                "time='" + time + '\'' +
                "user_id='" + user_id + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Information{
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

        private List<String> contentList;


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){
            return this.fuzzyContent;
        }

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){
            return this.rightFuzzyContent;
        }
        private List<String> typeList;


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){
            return this.fuzzyType;
        }

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){
            return this.rightFuzzyType;
        }
        private List<java.time.LocalDateTime> timeList;

        private java.time.LocalDateTime timeSt;

        private java.time.LocalDateTime timeEd;

        public java.time.LocalDateTime getTimeSt(){
            return this.timeSt;
        }

        public java.time.LocalDateTime getTimeEd(){
            return this.timeEd;
        }

        private List<Integer> user_idList;

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){
            return this.user_idSt;
        }

        public Integer getUser_idEd(){
            return this.user_idEd;
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



        public QueryBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public QueryBuilder fuzzyContent (String ... fuzzyContent){
            if (fuzzyContent != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyContent){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyContent = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public QueryBuilder rightFuzzyContent (String ... rightFuzzyContent){
            if (rightFuzzyContent != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyContent){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyContent = list;
            }
            return this;
        }

        public QueryBuilder content(String content){
            setContent(content);
            return this;
        }

        public QueryBuilder contentList(String ... content){
            if (content != null){
                List<String> list = new ArrayList<>();
                for (String item : content){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.contentList = list;
            }

            return this;
        }

        public QueryBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public QueryBuilder fetchContent(){
            setFetchFields("fetchFields","content");
            return this;
        }

        public QueryBuilder excludeContent(){
            setFetchFields("excludeFields","content");
            return this;
        }



        public QueryBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public QueryBuilder fuzzyType (String ... fuzzyType){
            if (fuzzyType != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyType){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyType = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public QueryBuilder rightFuzzyType (String ... rightFuzzyType){
            if (rightFuzzyType != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyType){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyType = list;
            }
            return this;
        }

        public QueryBuilder type(String type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(String ... type){
            if (type != null){
                List<String> list = new ArrayList<>();
                for (String item : type){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.typeList = list;
            }

            return this;
        }

        public QueryBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }



        public QueryBuilder timeBetWeen(java.time.LocalDateTime timeSt,java.time.LocalDateTime timeEd){
            this.timeSt = timeSt;
            this.timeEd = timeEd;
            return this;
        }

        public QueryBuilder timeGreaterEqThan(java.time.LocalDateTime timeSt){
            this.timeSt = timeSt;
            return this;
        }
        public QueryBuilder timeLessEqThan(java.time.LocalDateTime timeEd){
            this.timeEd = timeEd;
            return this;
        }


        public QueryBuilder time(java.time.LocalDateTime time){
            setTime(time);
            return this;
        }

        public QueryBuilder timeList(java.time.LocalDateTime ... time){
            if (time != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : time){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.timeList = list;
            }

            return this;
        }

        public QueryBuilder timeList(List<java.time.LocalDateTime> time){
            this.timeList = time;
            return this;
        }

        public QueryBuilder fetchTime(){
            setFetchFields("fetchFields","time");
            return this;
        }

        public QueryBuilder excludeTime(){
            setFetchFields("excludeFields","time");
            return this;
        }



        public QueryBuilder user_idBetWeen(Integer user_idSt,Integer user_idEd){
            this.user_idSt = user_idSt;
            this.user_idEd = user_idEd;
            return this;
        }

        public QueryBuilder user_idGreaterEqThan(Integer user_idSt){
            this.user_idSt = user_idSt;
            return this;
        }
        public QueryBuilder user_idLessEqThan(Integer user_idEd){
            this.user_idEd = user_idEd;
            return this;
        }


        public QueryBuilder user_id(Integer user_id){
            setUser_id(user_id);
            return this;
        }

        public QueryBuilder user_idList(Integer ... user_id){
            if (user_id != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : user_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.user_idList = list;
            }

            return this;
        }

        public QueryBuilder user_idList(List<Integer> user_id){
            this.user_idList = user_id;
            return this;
        }

        public QueryBuilder fetchUser_id(){
            setFetchFields("fetchFields","user_id");
            return this;
        }

        public QueryBuilder excludeUser_id(){
            setFetchFields("excludeFields","user_id");
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

        public Information build(){
            return this;
        }
    }

}
