package com.guizhou.map.service;

import com.guizhou.map.domain.fungus;
import com.guizhou.map.domain.predict;
import java.util.*;
public interface PredictService {

    List<predict> getAllFungi();
    List<predict> selectByname(String genus);
    List<predict> updateByid(int id);
    List<predict> removeDuplicateCase_p(List<predict> list);
    List<predict> findbycity_p(List<predict> list,String city );
    List<predict> findbycountry_p(List<predict> list ,String country);
    List<predict> findbyfungusname_p(List<predict> list,String fungusname);
    double[][] listconverttoarr_p(List<predict> list);
    double[][] listconverttoarr_p(List<predict> list,List<fungus> list2);
    Object findinthisfungi_fp(List<fungus> list,List<predict> list_p,int column,int row);
    List<predict> findinthisfungi_p(List<predict> list,int column,int row);
    List<predict> selectdata(String city,String country,String funginame);

}
