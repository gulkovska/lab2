<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            <body>
                <h1>Plants</h1>
                <ul>
                    <xsl:for-each select="Flower/Plant">
                        <li>
                            <b><xsl:value-of select="Name"/></b>
                            -
                            <xsl:value-of select="Origin"/>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
