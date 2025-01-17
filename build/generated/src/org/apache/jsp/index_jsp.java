package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.BlogDao;
import java.util.ArrayList;
import com.daos.CategoryDao;
import com.beans.Category;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"TemplateMo\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <title>Inno Blogger Home</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Additional CSS Files -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-stand-blog.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("TemplateMo 551 Stand Blog\r\n");
      out.write("\r\n");
      out.write("https://templatemo.com/tm-551-stand-blog\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    <!-- ***** Preloader Start ***** -->\r\n");
      out.write("    <div id=\"preloader\">\r\n");
      out.write("        <div class=\"jumper\">\r\n");
      out.write("            <div></div>\r\n");
      out.write("            <div></div>\r\n");
      out.write("            <div></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>  \r\n");
      out.write("    <!-- ***** Preloader End ***** -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Page Content -->\r\n");
      out.write("    <!-- Banner Starts Here -->\r\n");
      out.write("    <div class=\"main-banner header-text\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"owl-banner owl-carousel\">\r\n");
      out.write("         \r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Banner Ends Here -->\r\n");
      out.write("  <section class=\"blog-posts\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-lg-8\">\r\n");
      out.write("            <div class=\"all-blog-posts\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                  <div class=\"blog-post\">\r\n");
      out.write("                    <div class=\"blog-thumb\">\r\n");
      out.write("                      <img src=\"assets/images/blog-post-01.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"down-content\">\r\n");
      out.write("                      <span>Lifestyle</span>\r\n");
      out.write("                      <a href=\"post-details.jsp.html\"><h4>Best Template Website for HTML CSS</h4></a>\r\n");
      out.write("                      <ul class=\"post-info\">\r\n");
      out.write("                        <li><a href=\"#\">Admin</a></li>\r\n");
      out.write("                        <li><a href=\"#\">May 31, 2020</a></li>\r\n");
      out.write("                        <li><a href=\"#\">12 Comments</a></li>\r\n");
      out.write("                      </ul>\r\n");
      out.write("                      <p>Stand Blog is a free HTML CSS template for your CMS theme. You can easily adapt or customize it for any kind of CMS or website builder. You are allowed to use it for your business. You are NOT allowed to re-distribute the template ZIP file on any template collection site for the download purpose. <a rel=\"nofollow\" href=\"https://templatemo.com/contact\" target=\"_parent\">Contact TemplateMo</a> for more info. Thank you.</p>\r\n");
      out.write("                      <div class=\"post-options\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-6\">\r\n");
      out.write("                            <ul class=\"post-tags\">\r\n");
      out.write("                              <li><i class=\"fa fa-tags\"></i></li>\r\n");
      out.write("                              <li><a href=\"#\">Beauty</a>,</li>\r\n");
      out.write("                              <li><a href=\"#\">Nature</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-6\">\r\n");
      out.write("                            <ul class=\"post-share\">\r\n");
      out.write("                              <li><i class=\"fa fa-share-alt\"></i></li>\r\n");
      out.write("                              <li><a href=\"#\">Facebook</a>,</li>\r\n");
      out.write("                              <li><a href=\"#\"> Twitter</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                  <div class=\"blog-post\">\r\n");
      out.write("                    <div class=\"blog-thumb\">\r\n");
      out.write("                      <img src=\"assets/images/blog-post-02.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"down-content\">\r\n");
      out.write("                      <span>Healthy</span>\r\n");
      out.write("                      <a href=\"post-details.jsp.html\"><h4>Etiam id diam vitae lorem dictum</h4></a>\r\n");
      out.write("                      <ul class=\"post-info\">\r\n");
      out.write("                        <li><a href=\"#\">Admin</a></li>\r\n");
      out.write("                        <li><a href=\"#\">May 24, 2020</a></li>\r\n");
      out.write("                        <li><a href=\"#\">36 Comments</a></li>\r\n");
      out.write("                      </ul>\r\n");
      out.write("                      <p>You can support us by contributing a little via PayPal. Please contact <a rel=\"nofollow\" href=\"https://templatemo.com/contact\" target=\"_parent\">TemplateMo</a> via Live Chat or Email. If you have any question or feedback about this template, feel free to talk to us. Also, you may check other CSS templates such as <a rel=\"nofollow\" href=\"https://templatemo.com/tag/multi-page\" target=\"_parent\">multi-page</a>, <a rel=\"nofollow\" href=\"https://templatemo.com/tag/resume\" target=\"_parent\">resume</a>, <a rel=\"nofollow\" href=\"https://templatemo.com/tag/video\" target=\"_parent\">video</a>, etc.</p>\r\n");
      out.write("                      <div class=\"post-options\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-6\">\r\n");
      out.write("                            <ul class=\"post-tags\">\r\n");
      out.write("                              <li><i class=\"fa fa-tags\"></i></li>\r\n");
      out.write("                              <li><a href=\"#\">Best Templates</a>,</li>\r\n");
      out.write("                              <li><a href=\"#\">TemplateMo</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-6\">\r\n");
      out.write("                            <ul class=\"post-share\">\r\n");
      out.write("                              <li><i class=\"fa fa-share-alt\"></i></li>\r\n");
      out.write("                              <li><a href=\"#\">Facebook</a>,</li>\r\n");
      out.write("                              <li><a href=\"#\">Twitter</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                  <div class=\"blog-post\">\r\n");
      out.write("                    <div class=\"blog-thumb\">\r\n");
      out.write("                      <img src=\"assets/images/blog-post-03.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"down-content\">\r\n");
      out.write("                      <span>Fashion</span>\r\n");
      out.write("                      <a href=\"post-details.jsp.html\"><h4>Donec tincidunt leo nec magna</h4></a>\r\n");
      out.write("                      <ul class=\"post-info\">\r\n");
      out.write("                        <li><a href=\"#\">Admin</a></li>\r\n");
      out.write("                        <li><a href=\"#\">May 14, 2020</a></li>\r\n");
      out.write("                        <li><a href=\"#\">48 Comments</a></li>\r\n");
      out.write("                      </ul>\r\n");
      out.write("                      <p>Nullam at quam ut lacus aliquam tempor vel sed ipsum. Donec pellentesque tincidunt imperdiet. Mauris sit amet justo vulputate, cursus massa congue, vestibulum odio. Aenean elit nunc, gravida in erat sit amet, feugiat viverra leo. Phasellus interdum, diam commodo egestas rhoncus, turpis nisi consectetur nibh, in vehicula eros orci vel neque.</p>\r\n");
      out.write("                      <div class=\"post-options\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-6\">\r\n");
      out.write("                            <ul class=\"post-tags\">\r\n");
      out.write("                              <li><i class=\"fa fa-tags\"></i></li>\r\n");
      out.write("                              <li><a href=\"#\">HTML CSS</a>,</li>\r\n");
      out.write("                              <li><a href=\"#\">Photoshop</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-6\">\r\n");
      out.write("                            <ul class=\"post-share\">\r\n");
      out.write("                              <li><i class=\"fa fa-share-alt\"></i></li>\r\n");
      out.write("                              <li><a href=\"#\">Facebook</a>,</li>\r\n");
      out.write("                              <li><a href=\"#\">Twitter</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                  <div class=\"main-button\">\r\n");
      out.write("                    <a href=\"blog.html\">View All Posts</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-4\">\r\n");
      out.write("            <div class=\"sidebar\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                  <div class=\"sidebar-item search\">\r\n");
      out.write("                    <form id=\"search_form\" name=\"gs\" method=\"GET\" action=\"#\">\r\n");
      out.write("                      <input type=\"text\" name=\"q\" class=\"searchText\" placeholder=\"type to search...\" autocomplete=\"on\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                  <div class=\"sidebar-item recent-posts\">\r\n");
      out.write("                    <div class=\"sidebar-heading\">\r\n");
      out.write("                      <h2>Recent Posts</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                      <ul>\r\n");
      out.write("                        <li><a href=\"post-details.jsp.html\">\r\n");
      out.write("                          <h5>Vestibulum id turpis porttitor sapien facilisis scelerisque</h5>\r\n");
      out.write("                          <span>May 31, 2020</span>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                        <li><a href=\"post-details.jsp.html\">\r\n");
      out.write("                          <h5>Suspendisse et metus nec libero ultrices varius eget in risus</h5>\r\n");
      out.write("                          <span>May 28, 2020</span>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                        <li><a href=\"post-details.jsp.html\">\r\n");
      out.write("                          <h5>Swag hella echo park leggings, shaman cornhole ethical coloring</h5>\r\n");
      out.write("                          <span>May 14, 2020</span>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                      </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                  <div class=\"sidebar-item categories\">\r\n");
      out.write("                    <div class=\"sidebar-heading\">\r\n");
      out.write("                      <h2>Categories</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                     <ul>\r\n");
      out.write("                    ");
 CategoryDao cd = new CategoryDao();
                    BlogDao bd = new BlogDao();
                    ArrayList<Category> clist = cd.getAllCategories();
                    for(Category c : clist){
      out.write("\r\n");
      out.write("                    <li><h6><a href=\"#\">- ");
      out.print(c.getName());
      out.write("</a> <span class=\"badge badge-secondary\">");
      out.print(bd.getBlogCountByCategory(c.getId()));
      out.write("</span></h6></li>\r\n");
      out.write("                      ");
}
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("   <!--footer section -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <!-- Bootstrap core JavaScript -->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Additional Scripts -->\r\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/owl.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/slick.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/isotope.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/accordions.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script language = \"text/Javascript\"> \r\n");
      out.write("      cleared[0] = cleared[1] = cleared[2] = 0; //set a cleared flag for each field\r\n");
      out.write("      function clearField(t){                   //declaring the array outside of the\r\n");
      out.write("      if(! cleared[t.id]){                      // function makes it static and global\r\n");
      out.write("          cleared[t.id] = 1;  // you could use true and false, but that's more typing\r\n");
      out.write("          t.value='';         // with more chance of typos\r\n");
      out.write("          t.style.color='#fff';\r\n");
      out.write("          }\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
